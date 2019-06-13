package com.elmaghraby.android.firstapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment {

    String[] ssaray={"Grade One",
            "Grade Two","Grade Three","Grade Four","Grade Five","Grade Six","Grade Seven","Grade Eight","Grade Nine","Grade Ten","Grade Eleven","Grade Twelve"
    };


    public homeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_home, container, false);

        ListView listView=myView.findViewById(R.id.listview);
        listadapter listadapter=new listadapter();
        listView.setAdapter(listadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(),AfterGrade.class);
                startActivity(intent);
            }
        });

        return myView ;
    }


    class listadapter extends BaseAdapter{


        @Override
        public int getCount() {
            return ssaray.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            //view =getLayoutInflater().inflate(R.layout.listitem,false);
            view = getLayoutInflater().inflate(R.layout.listitem , viewGroup ,false);

            TextView itemtext =view.findViewById(R.id.textitem);
            itemtext.setText(ssaray[i]);


            return view;
        }
    }

}
