package com.example.htp.ui.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.htp.ui.activity.NavigationActivity;
import com.example.htp.htpandroidframe.R;


public class TestFragment extends Fragment implements OnClickListener,
		NavigationActivity.CloseSoftKeyboardListener {

	private EditText search_site;
	private ImageButton btn_search_delete;
	private Button icon_search;
	private ProgressDialog mpDialog;
	private Context context;
	private TextView bus_help;
	private InputMethodManager imm;// 软键盘相关
	private ImageView panel_img;
	private TextView panel_name;
	private LinearLayout collect_lin;
	private View share_lin;
	private TextView title;
	private View help_lin;
	private View setting_lin;
	private View accountInfo_lin;
	private ImageView titleIcon;
	private View logout_lin;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = getActivity();
		imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_test, null);
		initView(rootView);
		registerListener();

		((NavigationActivity) context).registerMyTouchListener(this);
		return rootView;
	}

	private void registerListener() {
		// TODO Auto-generated method stub
	}

	private void initView(View rootView) {
		// TODO Auto-generated method stub

	}

	private void initListView() {
		bus_help.setVisibility(View.GONE);
	}

	@Override
	public void onClick(View v) {

	}
	//退出
	private void logout() {
		// TODO Auto-generated method stub
		//清楚记录
		//AppContext.getInstance().Logout();
		//AppManager.getAppManager().AppExit(getActivity());
		getActivity().finish();
		//UIHelper.showMobileLoginActivity(getActivity());

	}

	private void dismissShow() {
		if (mpDialog != null) {
			mpDialog.dismiss();
		}
	}

	class BusSiteHolder {
		TextView name;
		TextView posotion_text;
		TextView sect_canton;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		((NavigationActivity) context).unRegisterMyTouchListener(this);
	}

	@Override
	public void onCloseListener() {
		/* imm.hideSoftInputFromWindow(search_site.getWindowToken(), 0); */

	}

}
