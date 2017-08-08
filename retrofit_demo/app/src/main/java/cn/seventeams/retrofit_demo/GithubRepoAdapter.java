package cn.seventeams.retrofit_demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static cn.seventeams.retrofit_demo.R.id.repo_name;

/**
 * Created by seven on 2017/8/5.
 */

public class GithubRepoAdapter extends ArrayAdapter<GithubRepo> {
    Context context;
    List<GithubRepo> repos;

    public GithubRepoAdapter(Context context, List<GithubRepo> repos){
        super(context,R.layout.list_item,repos);
        this.context = context;
        this.repos = repos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.repo_name);

        GithubRepo item = repos.get(position);
        String message = item.getName();
        textView.setText(message);

        return row;
    }
}
