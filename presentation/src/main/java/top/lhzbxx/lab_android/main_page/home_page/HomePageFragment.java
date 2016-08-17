package top.lhzbxx.lab_android.main_page.home_page;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.lhzbxx.lab_android.R;
import top.lhzbxx.lab_android.main_page.MainActivity;

/**
 * Created by Administrator on 2016/7/26.
 */
public class HomePageFragment extends Fragment implements HomePageContract.View{

    @BindView(R.id.tool_bar)
    Toolbar toolbar;

    @BindView(R.id.main_page_list)
    RecyclerView recyclerView;

    private HomePageContract.Presenter mPresenter;



    @Override
    public void setPresenter(HomePageContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_page_layout, container, false);
        ButterKnife.bind(this, view);
        initView();
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);


        return view;
    }

    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new HomePageAdapter(getContext()));


        toolbar.setTitle("");


    }


}
