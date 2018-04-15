package cr.ac.unadeca.todofrank.subclases;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import cr.ac.unadeca.todofrank.R;

public class ToDoViewHolder extends RecyclerView.ViewHolder{

    public HtmlTextView html;
    public ImageView borrar;


    public ToDoViewHolder(View itemView) {
        super(itemView);

        html = itemView.findViewById(R.id.html_text);
        borrar = itemView.findViewById(R.id.delate);
    }
}
