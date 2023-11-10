package com.example.firstapplication

import MovieAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firstapplication.databinding.FragmentMovieListBinding

class MovieListFragment : Fragment() {
    lateinit var binding: FragmentMovieListBinding

    lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMovieListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = ArrayList<Movie>()
        list.add(Movie("Harry Potter", "Harry Potter`s description", R.drawable.harry_potter))
        list.add(Movie("John Wick", "John Wick`s description", R.drawable.john_wick))
        list.add(Movie("Top Gun: Maverick", "Top Gun: Maverick`s description", R.drawable.top_gun))

        adapter = MovieAdapter() { movie, position ->
            findNavController().navigate(
                MovieListFragmentDirections.actionMovieListFragmentToMovieDetailFragment(
                    movie.title,
                    movie.description,
                    movie.imageUrl
                )
            )
        }
        adapter.setList(list)
        binding.recyclerView.adapter = adapter
    }
}