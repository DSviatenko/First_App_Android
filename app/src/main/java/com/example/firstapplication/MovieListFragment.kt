package com.example.firstapplication

import MovieAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 * Use the [MovieListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
//class MovieListFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_movie_list, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        //
//    }
//}


//class MovieListFragment : Fragment() {
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var adapter: MovieAdapter
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
//
//        // Initialization of RecyclerView and adapter
//        recyclerView = view.findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        adapter = MovieAdapter(getSampleMovies())
//
//        // Set click listener for RecyclerView items
//        adapter.setOnItemClickListener { position ->
//            val selectedMovie = adapter.getItem(position)
//            val action = MovieListFragmentDirections.actionMovieListFragmentToMovieDetailFragment(selectedMovie)
//            findNavController().navigate(action)
//        }
//
//        recyclerView.adapter = adapter
//
//        return view
//    }
//
//    // Method to get a sample list of movies
//    private fun getSampleMovies(): List<Movie> {
//        // Populate this list with your actual movie data
//        return listOf(
//            Movie("Movie 1", "Description 1", "url1"),
//            Movie("Movie 2", "Description 2", "url2"),
//            Movie("Movie 3", "Description 3", "url3")
//            // Add more movies as needed
//        )
//    }
//}

class MovieListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)

        // Initialize RecyclerView and adapter
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = MovieAdapter(getSampleMovies()) { selectedMovie ->
            // Navigate to MovieDetailFragment with the selected movie
            val action = MovieListFragmentDirections.actionMovieListFragmentToMovieDetailFragment(selectedMovie)
            findNavController().navigate(action)
        }
        recyclerView.adapter = adapter

        return view
    }

    private fun getSampleMovies(): List<Movie> {
        return listOf(
            Movie("Harry Potter", "Harry Potter`s description", R.drawable.harry_potter),
            Movie("John Wick", "John Wick`s description", R.drawable.john_wick),
            Movie("Top Gun: Maverick", "Top Gun: Maverick`s description", R.drawable.top_gun)
        )
    }
}