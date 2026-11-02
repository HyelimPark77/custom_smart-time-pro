package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportNavigatorRecordBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemBackwardMon;

    @NonNull
    public final PFMedium itemBackwardNum;

    @NonNull
    public final PFMedium itemFlatMon;

    @NonNull
    public final PFMedium itemFlatNum;

    @NonNull
    public final LinearLayout itemLastRecord;

    @NonNull
    public final PFMedium itemLeadingMon;

    @NonNull
    public final PFMedium itemLeadingNum;

    @NonNull
    public final PFMedium itemLinChartRecordActual;

    @NonNull
    public final PFMedium itemLinChartRecordDifference;

    @NonNull
    public final PFMedium itemLinChartRecordTarget;

    @NonNull
    public final PFMedium itemLinChartRecordTime;

    @NonNull
    public final PFMedium itemLinChartRecordType;

    @NonNull
    public final PFMedium itemListRecordMore;

    @NonNull
    public final PFMedium itemModeName;

    @NonNull
    public final PFMedium itemSpeedTv;

    @NonNull
    public final PFMedium itemTimeTv;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final PFMedium recordSportsDuration;

    @NonNull
    public final AppCompatImageView recordSportsIcon;

    @NonNull
    public final PFMedium recordSportsTime;

    @NonNull
    public final PFMedium recordSportsTitle;

    @NonNull
    public final PFMedium recordSportsValue;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ItemSportNavigatorRecordBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemBackwardMon, @NonNull PFMedium itemBackwardNum, @NonNull PFMedium itemFlatMon, @NonNull PFMedium itemFlatNum, @NonNull LinearLayout itemLastRecord, @NonNull PFMedium itemLeadingMon, @NonNull PFMedium itemLeadingNum, @NonNull PFMedium itemLinChartRecordActual, @NonNull PFMedium itemLinChartRecordDifference, @NonNull PFMedium itemLinChartRecordTarget, @NonNull PFMedium itemLinChartRecordTime, @NonNull PFMedium itemLinChartRecordType, @NonNull PFMedium itemListRecordMore, @NonNull PFMedium itemModeName, @NonNull PFMedium itemSpeedTv, @NonNull PFMedium itemTimeTv, @NonNull LineChart lineChart, @NonNull PFMedium recordSportsDuration, @NonNull AppCompatImageView recordSportsIcon, @NonNull PFMedium recordSportsTime, @NonNull PFMedium recordSportsTitle, @NonNull PFMedium recordSportsValue, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemBackwardMon = itemBackwardMon;
        this.itemBackwardNum = itemBackwardNum;
        this.itemFlatMon = itemFlatMon;
        this.itemFlatNum = itemFlatNum;
        this.itemLastRecord = itemLastRecord;
        this.itemLeadingMon = itemLeadingMon;
        this.itemLeadingNum = itemLeadingNum;
        this.itemLinChartRecordActual = itemLinChartRecordActual;
        this.itemLinChartRecordDifference = itemLinChartRecordDifference;
        this.itemLinChartRecordTarget = itemLinChartRecordTarget;
        this.itemLinChartRecordTime = itemLinChartRecordTime;
        this.itemLinChartRecordType = itemLinChartRecordType;
        this.itemListRecordMore = itemListRecordMore;
        this.itemModeName = itemModeName;
        this.itemSpeedTv = itemSpeedTv;
        this.itemTimeTv = itemTimeTv;
        this.lineChart = lineChart;
        this.recordSportsDuration = recordSportsDuration;
        this.recordSportsIcon = recordSportsIcon;
        this.recordSportsTime = recordSportsTime;
        this.recordSportsTitle = recordSportsTitle;
        this.recordSportsValue = recordSportsValue;
        this.root = root;
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding bind(@NonNull View rootView) {
        int i = R.id.item_backward_mon;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_backward_mon);
        if (pFMedium != null) {
            i = R.id.item_backward_num;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_backward_num);
            if (pFMedium2 != null) {
                i = R.id.item_flat_mon;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_flat_mon);
                if (pFMedium3 != null) {
                    i = R.id.item_flat_num;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_flat_num);
                    if (pFMedium4 != null) {
                        i = R.id.item_last_record;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_last_record);
                        if (linearLayout != null) {
                            i = R.id.item_leading_mon;
                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_leading_mon);
                            if (pFMedium5 != null) {
                                i = R.id.item_leading_num;
                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_leading_num);
                                if (pFMedium6 != null) {
                                    i = R.id.item_lin_chart_record_actual;
                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_actual);
                                    if (pFMedium7 != null) {
                                        i = R.id.item_lin_chart_record_difference;
                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_difference);
                                        if (pFMedium8 != null) {
                                            i = R.id.item_lin_chart_record_target;
                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_target);
                                            if (pFMedium9 != null) {
                                                i = R.id.item_lin_chart_record_time;
                                                PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_time);
                                                if (pFMedium10 != null) {
                                                    i = R.id.item_lin_chart_record_type;
                                                    PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_type);
                                                    if (pFMedium11 != null) {
                                                        i = R.id.item_list_record_more;
                                                        PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_list_record_more);
                                                        if (pFMedium12 != null) {
                                                            i = R.id.item_mode_name;
                                                            PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_mode_name);
                                                            if (pFMedium13 != null) {
                                                                i = R.id.item_speed_tv;
                                                                PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_speed_tv);
                                                                if (pFMedium14 != null) {
                                                                    i = R.id.item_time_tv;
                                                                    PFMedium pFMedium15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_time_tv);
                                                                    if (pFMedium15 != null) {
                                                                        i = R.id.line_chart;
                                                                        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
                                                                        if (lineChart != null) {
                                                                            i = R.id.record_sports_duration;
                                                                            PFMedium pFMedium16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
                                                                            if (pFMedium16 != null) {
                                                                                i = R.id.record_sports_icon;
                                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
                                                                                if (appCompatImageView != null) {
                                                                                    i = R.id.record_sports_time;
                                                                                    PFMedium pFMedium17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
                                                                                    if (pFMedium17 != null) {
                                                                                        i = R.id.record_sports_title;
                                                                                        PFMedium pFMedium18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
                                                                                        if (pFMedium18 != null) {
                                                                                            i = R.id.record_sports_value;
                                                                                            PFMedium pFMedium19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
                                                                                            if (pFMedium19 != null) {
                                                                                                LinearLayout linearLayout2 = (LinearLayout) rootView;
                                                                                                return new ItemSportNavigatorRecordBinding(linearLayout2, pFMedium, pFMedium2, pFMedium3, pFMedium4, linearLayout, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10, pFMedium11, pFMedium12, pFMedium13, pFMedium14, pFMedium15, lineChart, pFMedium16, appCompatImageView, pFMedium17, pFMedium18, pFMedium19, linearLayout2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_navigator_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
