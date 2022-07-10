package app.car.spymanual;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import app.car.spymanual.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        setHasOptionsMenu(true);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView img = (TextView)view.findViewById(R.id.title);
        Animation aniSlide = AnimationUtils.loadAnimation(getContext(),R.anim.zoomin);
        img.startAnimation(aniSlide);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                ((MainActivity)getActivity()).openSecondFragment();
            }
        }, 4000);
    }

//    INFO PASSING BETWEEN FRAGMENTS
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            //Restore the fragment's state here
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
//
//
//
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
////        int id = item.getItemId();
////        switch (id){
////            default:
////                Toast.makeText(getContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
////            case R.id.action_settings:
////                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
////            case R.id.action_info:
////                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new InfoFragment()).commit();
////        }
//
//
//
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}