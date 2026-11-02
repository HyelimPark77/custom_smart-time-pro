package com.sma.smartv3.model;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.Utils;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.sma.smartv3.p610ui.p611ai.AIAnswerActivity;
import com.sma.smartv3.p610ui.p611ai.AIChatActivity;
import com.sma.smartv3.p610ui.timezonepicker.TimeZonePicker;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIFunctionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n87#2,7:266\n94#2,3:274\n70#2,7:277\n97#2:284\n1#3:273\n774#4:285\n865#4,2:286\n774#4:288\n865#4,2:289\n*S KotlinDebug\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n*L\n21#1:266,7\n21#1:274,3\n21#1:277,7\n21#1:284\n21#1:273\n26#1:285\n26#1:286,2\n30#1:288\n30#1:289,2\n*E\n"})
public final class AIFunctionDataKt {
    @aa1
    public static final List<AIFunction> getAIFunction() {
        AIFunctionType aIFunctionType = AIFunctionType.AI;
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        return CollectionsKt__CollectionsKt.iIiiO(new AIFunction(aIFunctionType, UtilsKt.IXI(app) ? UtilsKt.XXO(R.string.wenxinyiyan) : UtilsKt.XXO(R.string.chatgpt), R.drawable.ai_function_ai_bg, UtilsKt.XXO(R.string.ai_desc), R.drawable.icon_ai_function_ai, 0, null, null, null, null, true, new Intent(Utils.getApp(), (Class<?>) AIChatActivity.class), TimeZonePicker.OXO1, null), new AIFunction(AIFunctionType.HEALTH_QA, UtilsKt.XXO(R.string.health_qa), R.drawable.ai_function_health_qa_bg, UtilsKt.XXO(R.string.health_qa_desc), R.drawable.icon_ai_function_health_qa, 0, null, null, null, null, true, new Intent(Utils.getApp(), (Class<?>) AIChatActivity.class), TimeZonePicker.OXO1, null), new AIFunction(AIFunctionType.PERSONAL_TRAINER, UtilsKt.XXO(R.string.personal_trainer), R.drawable.ai_function_personal_trainer_bg, UtilsKt.XXO(R.string.personal_trainer_desc), R.drawable.icon_ai_function_personal_trainer, 0, null, null, null, null, true, new Intent(Utils.getApp(), (Class<?>) AIChatActivity.class), TimeZonePicker.OXO1, null), new AIFunction(AIFunctionType.TRAVEL_GUIDES, UtilsKt.XXO(R.string.travel_guides), R.drawable.ai_function_travel_guides_bg, UtilsKt.XXO(R.string.travel_guides_desc), R.drawable.icon_ai_function_travel_guides, R.drawable.ai_answer_bg_2, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.travel_guides_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.travel_guides_details_example), UtilsKt.XXO(R.string.using_travel_guides), true, null, 2048, null), new AIFunction(AIFunctionType.EAT_HEALTHY, UtilsKt.XXO(R.string.eat_healthy), R.drawable.ai_function_eat_healthy_bg, UtilsKt.XXO(R.string.eat_healthy_desc), R.drawable.icon_ai_function_eat_healthy, R.drawable.ai_answer_bg_1, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.eat_healthy_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.eat_healthy_details_example), UtilsKt.XXO(R.string.eat_healthy), true, null, 2048, null), new AIFunction(AIFunctionType.DEAL_REVIEWS, UtilsKt.XXO(R.string.deal_reviews), R.drawable.ai_function_deal_reviews_bg, UtilsKt.XXO(R.string.deal_reviews_desc), R.drawable.icon_ai_function_deal_reviews, R.drawable.ai_answer_bg_3, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.deal_reviews_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.deal_reviews_details_example), UtilsKt.XXO(R.string.deal_reviews), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.HIGH_EQ_RESPONSE, UtilsKt.XXO(R.string.high_eq_response), R.drawable.ai_function_high_eq_response_bg, UtilsKt.XXO(R.string.high_eq_response_desc), R.drawable.icon_ai_function_high_eq_response, R.drawable.ai_answer_bg_2, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.high_eq_response_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.high_eq_response_details_example), UtilsKt.XXO(R.string.high_eq_response), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.SURNAME, UtilsKt.XXO(R.string.surname), R.drawable.ai_function_surname_bg, UtilsKt.XXO(R.string.surname_desc), R.drawable.icon_ai_function_surname, R.drawable.ai_answer_bg_4, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.surname_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.surname_details_example), UtilsKt.XXO(R.string.surname), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.PSYCHOLOGICAL_COUNSELOR, UtilsKt.XXO(R.string.psychological_counselor), R.drawable.ai_function_psychological_counselor_bg, UtilsKt.XXO(R.string.psychological_counselor_desc), R.drawable.icon_ai_function_psychological_counselor, R.drawable.ai_answer_bg_1, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.psychological_counselor_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.psychological_counselor_details_example), UtilsKt.XXO(R.string.using_psychological_provide), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.COMPLIMENT_MASTERS, UtilsKt.XXO(R.string.compliment_masters), R.drawable.ai_function_compliment_masters_bg, UtilsKt.XXO(R.string.compliment_masters_desc), R.drawable.icon_ai_function_compliment_masters, R.drawable.ai_answer_bg_3, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.compliment_masters_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.compliment_masters_details_example), UtilsKt.XXO(R.string.using_compliment_masters), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.APOLOGIZE, UtilsKt.XXO(R.string.apologize), R.drawable.ai_function_apologize_bg, UtilsKt.XXO(R.string.apologize_desc), R.drawable.icon_ai_function_apologize, R.drawable.ai_answer_bg_3, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.apologize_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.apologize_details_example), UtilsKt.XXO(R.string.apologize), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.DREAM_INTERPRETATION, UtilsKt.XXO(R.string.dream_interpretation), R.drawable.ai_function_dream_interpretation_bg, UtilsKt.XXO(R.string.dream_interpretation_desc), R.drawable.icon_ai_function_dream_interpretation, R.drawable.ai_answer_bg_2, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.dream_interpretation_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.dream_interpretation_details_example), UtilsKt.XXO(R.string.using_dream_interpretation), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.EVENT_PLANNING, UtilsKt.XXO(R.string.event_planning), R.drawable.ai_function_event_planning_bg, UtilsKt.XXO(R.string.event_planning_desc), R.drawable.icon_ai_function_event_planning, R.drawable.ai_answer_bg_5, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.event_planning_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.event_planning_details_example), UtilsKt.XXO(R.string.using_event_planning), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.SHORT_VIDEO_SCRIPTS, UtilsKt.XXO(R.string.short_video_scripts), R.drawable.ai_function_short_video_scripts_bg, UtilsKt.XXO(R.string.short_video_scripts_desc), R.drawable.icon_ai_function_short_video_scripts, R.drawable.ai_answer_bg_3, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.short_video_scripts_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.short_video_scripts_details_example), UtilsKt.XXO(R.string.short_video_scripts), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.E_MARKET_COPY, UtilsKt.XXO(R.string.e_market_copy), R.drawable.ai_function_e_market_copy_bg, UtilsKt.XXO(R.string.e_market_copy_desc), R.drawable.icon_ai_function_e_market_copy, R.drawable.ai_answer_bg_5, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.e_market_copy_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.e_market_copy_details_example), UtilsKt.XXO(R.string.e_market_copy), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.DAILY_WEEKLY, UtilsKt.XXO(R.string.daily_weekly), R.drawable.ai_function_daily_weekly_bg, UtilsKt.XXO(R.string.daily_weekly_desc), R.drawable.icon_ai_function_daily_weekly, R.drawable.ai_answer_bg_4, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.daily_weekly_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.daily_weekly_details_example), UtilsKt.XXO(R.string.using_daily_weekly), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.MARKET_ANALYSIS, UtilsKt.XXO(R.string.market_analysis), R.drawable.ai_function_market_analysis_bg, UtilsKt.XXO(R.string.market_analysis_desc), R.drawable.icon_ai_function_market_analysis, R.drawable.ai_answer_bg_1, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.market_analysis_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.market_analysis_details_example), UtilsKt.XXO(R.string.using_market_analysis), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.MOMENTS_COPYWRITING, UtilsKt.XXO(R.string.moments_copywriting), R.drawable.ai_function_moments_copywriting_bg, UtilsKt.XXO(R.string.moments_copywriting_desc), R.drawable.icon_ai_function_moments_copywriting, R.drawable.ai_answer_bg_1, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.moments_copywriting_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.moments_copywriting_details_example), UtilsKt.XXO(R.string.using_moments_copywriting), false, null, FileBrowseManager.f37790y, null), new AIFunction(AIFunctionType.LITTLE_RED_BOOK_STYLE, UtilsKt.XXO(R.string.little_red_book_style), R.drawable.ai_function_little_red_book_style_bg, UtilsKt.XXO(R.string.little_red_book_style_desc), R.drawable.icon_ai_function_little_red_book_style, R.drawable.ai_answer_bg_5, UtilsKt.XXO(R.string.content_describe), UtilsKt.XXO(R.string.little_red_book_style_details_hint), UtilsKt.XXO(R.string.ai_example_key) + ": " + UtilsKt.XXO(R.string.little_red_book_style_details_example), UtilsKt.XXO(R.string.little_red_book_style), false, null, FileBrowseManager.f37790y, null));
    }

    @aa1
    public static final List<AIFunction> getAIFunctionByCat(@aa1 AIFunctionCat cat) {
        Intrinsics.X0O(cat, "cat");
        List<AIFunction> aIFunction = getAIFunction();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aIFunction) {
            AIFunction aIFunction2 = (AIFunction) obj;
            if (!aIFunction2.isHot() && (aIFunction2.getType().getType() >>> 8) == cat.getCat()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @aa1
    public static final List<AIFunction> getHotAIFunction() {
        List<AIFunction> aIFunction = getAIFunction();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aIFunction) {
            if (((AIFunction) obj).isHot()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void toAIFunction(@aa1 Activity context, @aa1 AIFunction aiFunction) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(aiFunction, "aiFunction");
        if (aiFunction.getIntent() != null) {
            Intent intent = aiFunction.getIntent();
            Intrinsics.XXI(intent);
            intent.putExtra("mArg3", aiFunction);
            context.startActivity(aiFunction.getIntent());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", aiFunction);
        Intent intent2 = new Intent(context, (Class<?>) AIAnswerActivity.class);
        intent2.putExtras(bundle);
        context.startActivity(intent2);
    }
}
