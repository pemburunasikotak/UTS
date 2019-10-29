package tj.belajar.asu

import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.contact_list_item.view.*
import tj.belajar.wisataJogja.R
import tj.belajar.wisataJogja.R.*


class WisataAdapter(val wisataItemList: List<WisataData>, val clickListener: (WisataData) -> Unit):
        RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = from(parent.context)
        val view = inflater.inflate(layout.contact_list_item, parent, false)
        return PartViewHolder(view)

    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as  PartViewHolder).bind(wisataItemList[position],clickListener)
    }

    override fun getItemCount()=wisataItemList.size

    //mengasih nilai
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(wisata: WisataData, clickListener: (WisataData) -> Unit){

            itemView.tv_part_item_name.text= wisata.detailDiskripsi
            itemView.tv_part_id.text= wisata.tempat.toString()
            Picasso.get().load(wisata.image).resize(400,200).into(itemView.iv_contact_list)
            itemView.setOnClickListener({ clickListener(wisata)})
        }
    }
}