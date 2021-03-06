package org.redciudadana.monitorlegislativo.screens.representant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_representant.*
import org.redciudadana.monitorlegislativo.R
import org.redciudadana.monitorlegislativo.screens.main.MainView
import org.redciudadana.monitorlegislativo.utils.mvp.BaseFragment
import java.lang.ref.WeakReference

class RepresentantFragment: BaseFragment<RepresentantContract.View, RepresentantContract.Presenter, MainView>(), RepresentantContract.View {

    override var mPresenter: RepresentantContract.Presenter = RepresentantPresenter()

    var mDistrictAdapter: WeakReference<DistrictsAdapter>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_representant, container, false)
    }
    override fun initDistrictList(list: List<String>?) {
        val mLayoutManager = LinearLayoutManager(context)
        val districtsAdapter = DistrictsAdapter(this, mPresenter, list)
        representant_list.setHasFixedSize(true)
        representant_list.layoutManager = mLayoutManager
        representant_list.addItemDecoration(
            DividerItemDecoration(
                context,
                mLayoutManager.orientation
            )
        )
        representant_list.adapter = districtsAdapter
        mDistrictAdapter = WeakReference(districtsAdapter)

    }

    override fun updateDistrictList(list: List<String>?) {
        mDistrictAdapter?.get()?.districts = list
    }

    override fun showDistrictCandidates(district: String) {
        mActivityView?.showDiputados(district)
    }

    override fun setTitle() {
        mActivityView?.setTitle("¿Quién es mi representante?")
    }
}