package sg.edu.np.madpractical_s10186258;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt;
        TextView txt2;
        ImageView image;
        public ViewHolder(View itemView){
            super(itemView);
            txt=itemView.findViewById(R.id.textView2);
            txt2=itemView.findViewById(R.id.textView3);
            image = itemView.findViewById(R.id.imageView2);
        }
    }


