import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.firstapplication.Movie
import com.example.firstapplication.databinding.ItemMovieBinding

class MovieAdapter(
    val onClick: (movie: Movie, position: Int) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val list = ArrayList<Movie>()

    fun setList(newList: List<Movie>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(element: Movie, position: Int) {
            binding.Title.text = element.title
            binding.Description.text = element.description
            binding.btn.setOnClickListener {
                onClick(element, position)
            }

            Glide.with(binding.iv1.context)
                .load(element.imageUrl)
                .into(binding.iv1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val element = list[position]
        holder.bind(element, position)
    }

}