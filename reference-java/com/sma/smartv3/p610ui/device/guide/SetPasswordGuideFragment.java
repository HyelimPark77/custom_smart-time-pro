package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.appintro.SlideSelectionListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.SetPasswordHYKY;
import com.sma.smartv3.p610ui.device.guide.SetPasswordGuideFragment;
import com.sma.smartv3.pro.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,137:1\n19#2:138\n15#2:139\n183#3,4:140\n196#3:152\n252#4,7:144\n270#4:151\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n*L\n31#1:138\n31#1:139\n92#1:140,4\n92#1:152\n92#1:144,7\n92#1:151\n*E\n"})
public final class SetPasswordGuideFragment extends BaseFragment implements SlideSelectionListener {
    private Button btnConfirm;

    @aa1
    private AppUser mAppUser;
    private TextInputEditText newPassword;
    private TextInputEditText newPasswordAgain;
    private ScrollView rootScrollView;
    private View viewKeyboardHeight;

    public SetPasswordGuideFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(View view, SetPasswordGuideFragment setPasswordGuideFragment) {
        view.getLayoutParams().height = setPasswordGuideFragment.getMView().getHeight();
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$0(final SetPasswordGuideFragment setPasswordGuideFragment, final int i) {
        View view = setPasswordGuideFragment.viewKeyboardHeight;
        ScrollView scrollView = null;
        if (view == null) {
            Intrinsics.XXO("viewKeyboardHeight");
            view = null;
        }
        view.getLayoutParams().height = i;
        view.requestLayout();
        ScrollView scrollView2 = setPasswordGuideFragment.rootScrollView;
        if (scrollView2 == null) {
            Intrinsics.XXO("rootScrollView");
        } else {
            scrollView = scrollView2;
        }
        scrollView.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i54
            @Override // java.lang.Runnable
            public final void run() {
                SetPasswordGuideFragment.initView$lambda$2$0$1(this.f7757IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$0$1(SetPasswordGuideFragment setPasswordGuideFragment, int i) {
        ScrollView scrollView = setPasswordGuideFragment.rootScrollView;
        if (scrollView == null) {
            Intrinsics.XXO("rootScrollView");
            scrollView = null;
        }
        scrollView.smoothScrollTo(0, i / 2);
    }

    public final void confirm() {
        TextInputEditText textInputEditText = this.newPassword;
        ScrollView scrollView = null;
        if (textInputEditText == null) {
            Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
            textInputEditText = null;
        }
        if (String.valueOf(textInputEditText.getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_password);
            return;
        }
        TextInputEditText textInputEditText2 = this.newPasswordAgain;
        if (textInputEditText2 == null) {
            Intrinsics.XXO("newPasswordAgain");
            textInputEditText2 = null;
        }
        if (String.valueOf(textInputEditText2.getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_password_again);
            return;
        }
        TextInputEditText textInputEditText3 = this.newPassword;
        if (textInputEditText3 == null) {
            Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
            textInputEditText3 = null;
        }
        Editable text = textInputEditText3.getText();
        Intrinsics.XXI(text);
        if (text.length() >= 6) {
            TextInputEditText textInputEditText4 = this.newPassword;
            if (textInputEditText4 == null) {
                Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
                textInputEditText4 = null;
            }
            Editable text2 = textInputEditText4.getText();
            Intrinsics.XXI(text2);
            if (text2.length() <= 32) {
                TextInputEditText textInputEditText5 = this.newPassword;
                if (textInputEditText5 == null) {
                    Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
                    textInputEditText5 = null;
                }
                String strValueOf = String.valueOf(textInputEditText5.getText());
                TextInputEditText textInputEditText6 = this.newPasswordAgain;
                if (textInputEditText6 == null) {
                    Intrinsics.XXO("newPasswordAgain");
                    textInputEditText6 = null;
                }
                if (!Intrinsics.XOO0ii0(strValueOf, String.valueOf(textInputEditText6.getText()))) {
                    ToastUtils.showLong(R.string.inconsistent_passwords);
                    return;
                }
                NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                Pair pairOXO1 = TuplesKt.OXO1("identity", this.mAppUser.getIdentity());
                Pair pairOXO2 = TuplesKt.OXO1("projectId", RequestBodyKt.PROJECT_ID);
                TextInputEditText textInputEditText7 = this.newPassword;
                if (textInputEditText7 == null) {
                    Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
                    textInputEditText7 = null;
                }
                HashMap mapXXX11i = OXO1.XXX11i(pairOXO1, pairOXO2, TuplesKt.OXO1("password", String.valueOf(textInputEditText7.getText())));
                final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.guide.SetPasswordGuideFragment.confirm.1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        ToastUtils.showLong(R.string.password_updated_successfully);
                        SetPasswordGuideFragment.this.mAppUser.setPasswordStatus(true);
                        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(SetPasswordGuideFragment.this.mAppUser));
                        FragmentActivity activity = SetPasswordGuideFragment.this.getActivity();
                        if (activity != null) {
                            activity.setResult(-1);
                        }
                        FragmentActivity activity2 = SetPasswordGuideFragment.this.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        ToastUtils.showLong(error, new Object[0]);
                    }
                };
                final FragmentActivity activity = getActivity();
                ScrollView scrollView2 = this.rootScrollView;
                if (scrollView2 == null) {
                    Intrinsics.XXO("rootScrollView");
                } else {
                    scrollView = scrollView2;
                }
                final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, scrollView);
                String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetPasswordHYKY.URL);
                netWorkUtils.printParam(strConvertBaseUrl + SetPasswordHYKY.URL, mapXXX11i);
                NetWork netWork = NetWork.OXO1;
                String str = strConvertBaseUrl + SetPasswordHYKY.URL;
                final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.device.guide.SetPasswordGuideFragment$confirm$$inlined$post$1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(Response<String> response) {
                        NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                        Activity activity2 = activity;
                        O1XIiIO o1XIiIO3 = o1XIiIO;
                        C3006uq c3006uq = c3006uqLoadPopup;
                        LogUtils.m11128d(yn0.I0IIOi + response);
                        if (response == null) {
                            response = new Response<>();
                            response.setCode(-1000);
                        }
                        netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                        if (c3006uq != null) {
                            c3006uq.dismiss();
                        }
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
                    }
                };
                AndroidNetworking.post(str).addBodyParameter((Map<String, String>) mapXXX11i).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.device.guide.SetPasswordGuideFragment$confirm$$inlined$post$2
                    @Override // com.androidnetworking.interfaces.ParsedRequestListener
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void onResponse(Response<String> response) {
                        Intrinsics.X0O(response, "response");
                        o1XIiIO2.handleResponse(response);
                    }

                    @Override // com.androidnetworking.interfaces.ParsedRequestListener
                    public void onError(ANError aNError) {
                        Response response;
                        StringBuilder sb = new StringBuilder();
                        sb.append("errorCode:");
                        Integer numValueOf = null;
                        sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                        sb.append(", errorBody:");
                        sb.append(aNError != null ? aNError.getErrorBody() : null);
                        sb.append(", ");
                        sb.append(aNError != null ? aNError.getErrorDetail() : null);
                        LogUtils.m11128d(sb.toString());
                        if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                            numValueOf = Integer.valueOf(response.getCode());
                        } else if (aNError != null) {
                            numValueOf = Integer.valueOf(aNError.getErrorCode());
                        }
                        o1XIiIO2.handleError(String.valueOf(numValueOf));
                    }
                });
                return;
            }
        }
        ToastUtils.showLong(R.string.length_passwords);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        View mView = getMView();
        View viewFindViewById = mView.findViewById(R.id.view_keyboard_height);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.viewKeyboardHeight = viewFindViewById;
        View viewFindViewById2 = mView.findViewById(R.id.btn_confirm);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.btnConfirm = (Button) viewFindViewById2;
        View viewFindViewById3 = mView.findViewById(R.id.newPassword);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.newPassword = (TextInputEditText) viewFindViewById3;
        View viewFindViewById4 = mView.findViewById(R.id.newPasswordAgain);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.newPasswordAgain = (TextInputEditText) viewFindViewById4;
        View viewFindViewById5 = mView.findViewById(R.id.root_view);
        Intrinsics.O10IXXX0X(viewFindViewById5, "findViewById(...)");
        this.rootScrollView = (ScrollView) viewFindViewById5;
        final View viewFindViewById6 = mView.findViewById(R.id.llSetNewPassword);
        mView.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.f54
            @Override // java.lang.Runnable
            public final void run() {
                SetPasswordGuideFragment.initView$lambda$0$0(viewFindViewById6, this);
            }
        });
        Button button = this.btnConfirm;
        if (button == null) {
            Intrinsics.XXO("btnConfirm");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.g54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6815IO.confirm();
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.registerSoftInputChangedListener(activity.getWindow(), new KeyboardUtils.OnSoftInputChangedListener() { // from class: com.android.mltcode.paycertificationapi.h54
                @Override // com.blankj.utilcode.util.KeyboardUtils.OnSoftInputChangedListener
                public final void onSoftInputChanged(int i) {
                    SetPasswordGuideFragment.initView$lambda$2$0(this.OXO1, i);
                }
            });
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_app_guide_set_password;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.unregisterSoftInputChangedListener(activity.getWindow());
        }
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
