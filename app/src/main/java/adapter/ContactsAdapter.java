package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        Log.d("im in constructor", "onCreateViewHolder: ");
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Log.d("im in create holder", "onCreateViewHolder: ");
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact, viewGroup, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {

        Contacts contacts = contactsList.get(i);

        Log.d("im in bindview", "onBindViewHolder: ");
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageId());
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvPhone.setText(contacts.getPhoneno());

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }



    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgProfile;
        TextView tvName, tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgMyProfile);
            tvName = itemView.findViewById(R.id.tvMyName);
            tvPhone = itemView.findViewById(R.id.tvMyPhone);
            Log.d("Holder cons", "ContactsViewHolder: ");
        }
    }
}
