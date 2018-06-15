package me.guoyunhe.xiaoyepinyin;

import android.content.Context;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.LayoutInflater;

public class XiaoyePinyin extends InputMethodService {
    public XiaoyePinyin() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(final Configuration conf) {
        super.onConfigurationChanged(conf);
    }

    @Override
    public View onCreateInputView() {
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.method, null);

        return view;
    }
}
