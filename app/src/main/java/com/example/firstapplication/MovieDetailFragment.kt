package com.example.firstapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide


/**
 * A simple [Fragment] subclass.
 * Use the [MovieDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
//class MovieDetailFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_movie_detail, container, false)
//    }
//}

//class MovieDetailFragment : Fragment() {
//    private lateinit var titleTextView: TextView
//    private lateinit var descriptionTextView: TextView
//    private lateinit var movieImageView: ImageView
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_movie_detail, container, false)
//
//        titleTextView = view.findViewById(R.id.detailTitleTextView)
//        descriptionTextView = view.findViewById(R.id.detailDescriptionTextView)
//        movieImageView = view.findViewById(R.id.detailMovieImageView)
//
//        // Retrieve the selected movie details from arguments
//        val selectedMovie = arguments?.let { MovieDetailFragmentArgs.fromBundle(it).selectedMovie }
//
//        // Display movie details
//        selectedMovie?.let {
//            titleTextView.text = it.title
//            descriptionTextView.text = it.description
//            Glide.with(requireContext())
//                .load(it.imageUrl)
//                .into(movieImageView)
//        }
//
//        return view
//    }
//}

class MovieDetailFragment : Fragment() {
    private lateinit var titleTextView: TextView
    private lateinit var descriptionTextView: TextView
    private lateinit var movieImageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_detail, container, false)

        titleTextView = view.findViewById(R.id.title)
        descriptionTextView = view.findViewById(R.id.description)
        movieImageView = view.findViewById(R.id.img)

        val selectedMovie = arguments?.let { MovieDetailFragmentArgs.fromBundle(it).selectedMovie }

        selectedMovie?.let {
            titleTextView.text = it.title
            descriptionTextView.text = it.description
            Glide.with(requireContext())
                .load(it.imageUrl)
                .into(movieImageView)
        }

        return view
    }
}