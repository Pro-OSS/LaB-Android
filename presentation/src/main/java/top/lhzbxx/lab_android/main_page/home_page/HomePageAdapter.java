package top.lhzbxx.lab_android.main_page.home_page;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import java.security.PrivilegedAction;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.lhzbxx.lab_android.R;

/**
 * Created by Administrator on 2016/8/3.
 */
public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.HomePageViewHolder>{


    private Context context;

    private ArrayList<String> list = new ArrayList<>(110);


    public HomePageAdapter(Context context) {
        this.context = context;
        for (int i = 0; i < 100; i ++){
            list.add(i + ":");
        }

    }

    @Override
    public HomePageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_page_list_item_layout, parent, false);
        return new HomePageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomePageViewHolder holder, int position) {
        holder.test.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class HomePageViewHolder extends RecyclerView.ViewHolder{


        TextView test;

        public HomePageViewHolder(View itemView) {
            super(itemView);
            test = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
