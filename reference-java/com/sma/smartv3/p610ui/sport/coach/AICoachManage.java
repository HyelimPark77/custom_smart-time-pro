package com.sma.smartv3.p610ui.sport.coach;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.sma.smartv3.model.JsonFieldContainer;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAICoachBeforePlan;
import com.szabh.smable3.entity.BleAICoachCourse;
import com.szabh.smable3.entity.BleAICoachDayPlanCourse;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,710:1\n1878#2,2:711\n1869#2,2:713\n1880#2:715\n1#3:716\n85#4,3:717\n97#4,3:720\n*S KotlinDebug\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n*L\n176#1:711,2\n181#1:713,2\n176#1:715\n667#1:717,3\n150#1:720,3\n*E\n"})
public final class AICoachManage {
    public static final int I0IIOi = 0;
    public static final int I0iXXO = 4;

    /* JADX INFO: renamed from: IO */
    public static final int f54785IO = 2;

    @aa1
    public static final OXO1 IiI10X;
    public static final int OIX0iXi = 3;
    public static final int OIi0 = 1;

    @aa1
    public static volatile AICoachManage XOO0ii0 = null;
    public static final int XXI = 5;
    public boolean O00;

    @aa1
    public final String OXO1 = "AICoachManage";

    @aa1
    public VitalityData XIi00iiXO = new VitalityData(0.0f, 0, null, null, null, 0, 0, null, null, null, 0, 0, 0.0f, 0, null, 0, 65535, null);

    @tb1
    public BleAICoachGeneratePlan XO0O10;

    /* JADX INFO: renamed from: iO */
    @tb1
    public List<PlanGroupTitle> f54786iO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final AICoachManage OXO1() {
            return AICoachManage.XOO0ii0;
        }

        public final void XIi00iiXO(@aa1 AICoachManage aICoachManage) {
            Intrinsics.X0O(aICoachManage, "<set-?>");
            AICoachManage.XOO0ii0 = aICoachManage;
        }

        public OXO1() {
        }
    }

    public static final class PlanGroupTitle extends JsonFieldContainer implements Serializable {
        private boolean isCompleted;
        private boolean isHaveLesson;
        private int mLessonIndex;

        @aa1
        private String ofWeek;

        @aa1
        private String remarks;

        @aa1
        private String timeDay;

        public PlanGroupTitle() {
            this(null, null, false, false, 0, null, 63, null);
        }

        public static /* synthetic */ PlanGroupTitle copy$default(PlanGroupTitle planGroupTitle, String str, String str2, boolean z, boolean z2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = planGroupTitle.ofWeek;
            }
            if ((i2 & 2) != 0) {
                str2 = planGroupTitle.timeDay;
            }
            if ((i2 & 4) != 0) {
                z = planGroupTitle.isHaveLesson;
            }
            if ((i2 & 8) != 0) {
                z2 = planGroupTitle.isCompleted;
            }
            if ((i2 & 16) != 0) {
                i = planGroupTitle.mLessonIndex;
            }
            if ((i2 & 32) != 0) {
                str3 = planGroupTitle.remarks;
            }
            int i3 = i;
            String str4 = str3;
            return planGroupTitle.copy(str, str2, z, z2, i3, str4);
        }

        @aa1
        public final String component1() {
            return this.ofWeek;
        }

        @aa1
        public final String component2() {
            return this.timeDay;
        }

        public final boolean component3() {
            return this.isHaveLesson;
        }

        public final boolean component4() {
            return this.isCompleted;
        }

        public final int component5() {
            return this.mLessonIndex;
        }

        @aa1
        public final String component6() {
            return this.remarks;
        }

        @aa1
        public final PlanGroupTitle copy(@aa1 String ofWeek, @aa1 String timeDay, boolean z, boolean z2, int i, @aa1 String remarks) {
            Intrinsics.X0O(ofWeek, "ofWeek");
            Intrinsics.X0O(timeDay, "timeDay");
            Intrinsics.X0O(remarks, "remarks");
            return new PlanGroupTitle(ofWeek, timeDay, z, z2, i, remarks);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlanGroupTitle)) {
                return false;
            }
            PlanGroupTitle planGroupTitle = (PlanGroupTitle) obj;
            return Intrinsics.XOO0ii0(this.ofWeek, planGroupTitle.ofWeek) && Intrinsics.XOO0ii0(this.timeDay, planGroupTitle.timeDay) && this.isHaveLesson == planGroupTitle.isHaveLesson && this.isCompleted == planGroupTitle.isCompleted && this.mLessonIndex == planGroupTitle.mLessonIndex && Intrinsics.XOO0ii0(this.remarks, planGroupTitle.remarks);
        }

        public final int getMLessonIndex() {
            return this.mLessonIndex;
        }

        @aa1
        public final String getOfWeek() {
            return this.ofWeek;
        }

        @aa1
        public final String getRemarks() {
            return this.remarks;
        }

        @aa1
        public final String getTimeDay() {
            return this.timeDay;
        }

        public int hashCode() {
            return (((((((((this.ofWeek.hashCode() * 31) + this.timeDay.hashCode()) * 31) + Boolean.hashCode(this.isHaveLesson)) * 31) + Boolean.hashCode(this.isCompleted)) * 31) + Integer.hashCode(this.mLessonIndex)) * 31) + this.remarks.hashCode();
        }

        public final boolean isCompleted() {
            return this.isCompleted;
        }

        public final boolean isHaveLesson() {
            return this.isHaveLesson;
        }

        public final void setCompleted(boolean z) {
            this.isCompleted = z;
        }

        public final void setHaveLesson(boolean z) {
            this.isHaveLesson = z;
        }

        public final void setMLessonIndex(int i) {
            this.mLessonIndex = i;
        }

        public final void setOfWeek(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.ofWeek = str;
        }

        public final void setRemarks(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.remarks = str;
        }

        public final void setTimeDay(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.timeDay = str;
        }

        @aa1
        public String toString() {
            return "PlanGroupTitle(ofWeek=" + this.ofWeek + ", timeDay=" + this.timeDay + ", isHaveLesson=" + this.isHaveLesson + ", isCompleted=" + this.isCompleted + ", mLessonIndex=" + this.mLessonIndex + ", remarks=" + this.remarks + I000IiI1O.C2156iO.f1007iO;
        }

        public PlanGroupTitle(@aa1 String ofWeek, @aa1 String timeDay, boolean z, boolean z2, int i, @aa1 String remarks) {
            Intrinsics.X0O(ofWeek, "ofWeek");
            Intrinsics.X0O(timeDay, "timeDay");
            Intrinsics.X0O(remarks, "remarks");
            this.ofWeek = ofWeek;
            this.timeDay = timeDay;
            this.isHaveLesson = z;
            this.isCompleted = z2;
            this.mLessonIndex = i;
            this.remarks = remarks;
        }

        public /* synthetic */ PlanGroupTitle(String str, String str2, boolean z, boolean z2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "周日" : str, (i2 & 2) != 0 ? "01" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "" : str3);
        }
    }

    @SourceDebugExtension({"SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
    public static final class VitalityData extends JsonFieldContainer implements Serializable {

        @aa1
        private String dailyParameter;

        @aa1
        private List<Integer> dailySchedule;

        @aa1
        private int[] dailyTargets;

        @aa1
        private String generateParameter;
        private int level;
        private int mAllCalorie;
        private int mAllExerciseTime;
        private float mAll_METS;

        @tb1
        private BleAICoachBeforePlan mBeforePlanInfo;

        @aa1
        private List<Integer> mCompletionMark;
        private int mProgress;

        @tb1
        private List<VitalityLesson> mVitalityDayLesson;
        private float planTarget;
        private long startTime;
        private int userAge;
        private int weeklyTargetNumber;

        public VitalityData() {
            this(0.0f, 0, null, null, null, 0, 0L, null, null, null, 0, 0, 0.0f, 0, null, 0, 65535, null);
        }

        public final float component1() {
            return this.planTarget;
        }

        @aa1
        public final List<Integer> component10() {
            return this.mCompletionMark;
        }

        public final int component11() {
            return this.mProgress;
        }

        public final int component12() {
            return this.mAllExerciseTime;
        }

        public final float component13() {
            return this.mAll_METS;
        }

        public final int component14() {
            return this.mAllCalorie;
        }

        @tb1
        public final BleAICoachBeforePlan component15() {
            return this.mBeforePlanInfo;
        }

        public final int component16() {
            return this.userAge;
        }

        public final int component2() {
            return this.level;
        }

        @aa1
        public final String component3() {
            return this.generateParameter;
        }

        @aa1
        public final String component4() {
            return this.dailyParameter;
        }

        @tb1
        public final List<VitalityLesson> component5() {
            return this.mVitalityDayLesson;
        }

        public final int component6() {
            return this.weeklyTargetNumber;
        }

        public final long component7() {
            return this.startTime;
        }

        @aa1
        public final int[] component8() {
            return this.dailyTargets;
        }

        @aa1
        public final List<Integer> component9() {
            return this.dailySchedule;
        }

        @aa1
        public final VitalityData copy(float f, int i, @aa1 String generateParameter, @aa1 String dailyParameter, @tb1 List<VitalityLesson> list, int i2, long j, @aa1 int[] dailyTargets, @aa1 List<Integer> dailySchedule, @aa1 List<Integer> mCompletionMark, int i3, int i4, float f2, int i5, @tb1 BleAICoachBeforePlan bleAICoachBeforePlan, int i6) {
            Intrinsics.X0O(generateParameter, "generateParameter");
            Intrinsics.X0O(dailyParameter, "dailyParameter");
            Intrinsics.X0O(dailyTargets, "dailyTargets");
            Intrinsics.X0O(dailySchedule, "dailySchedule");
            Intrinsics.X0O(mCompletionMark, "mCompletionMark");
            return new VitalityData(f, i, generateParameter, dailyParameter, list, i2, j, dailyTargets, dailySchedule, mCompletionMark, i3, i4, f2, i5, bleAICoachBeforePlan, i6);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalityData)) {
                return false;
            }
            VitalityData vitalityData = (VitalityData) obj;
            return Float.compare(this.planTarget, vitalityData.planTarget) == 0 && this.level == vitalityData.level && Intrinsics.XOO0ii0(this.generateParameter, vitalityData.generateParameter) && Intrinsics.XOO0ii0(this.dailyParameter, vitalityData.dailyParameter) && Intrinsics.XOO0ii0(this.mVitalityDayLesson, vitalityData.mVitalityDayLesson) && this.weeklyTargetNumber == vitalityData.weeklyTargetNumber && this.startTime == vitalityData.startTime && Intrinsics.XOO0ii0(this.dailyTargets, vitalityData.dailyTargets) && Intrinsics.XOO0ii0(this.dailySchedule, vitalityData.dailySchedule) && Intrinsics.XOO0ii0(this.mCompletionMark, vitalityData.mCompletionMark) && this.mProgress == vitalityData.mProgress && this.mAllExerciseTime == vitalityData.mAllExerciseTime && Float.compare(this.mAll_METS, vitalityData.mAll_METS) == 0 && this.mAllCalorie == vitalityData.mAllCalorie && Intrinsics.XOO0ii0(this.mBeforePlanInfo, vitalityData.mBeforePlanInfo) && this.userAge == vitalityData.userAge;
        }

        @aa1
        public final String getDailyParameter() {
            return this.dailyParameter;
        }

        @aa1
        public final List<Integer> getDailySchedule() {
            return this.dailySchedule;
        }

        @aa1
        public final int[] getDailyTargets() {
            return this.dailyTargets;
        }

        @aa1
        public final String getGenerateParameter() {
            return this.generateParameter;
        }

        public final int getLevel() {
            return this.level;
        }

        public final int getMAllCalorie() {
            return this.mAllCalorie;
        }

        public final int getMAllExerciseTime() {
            return this.mAllExerciseTime;
        }

        public final float getMAll_METS() {
            return this.mAll_METS;
        }

        @tb1
        public final BleAICoachBeforePlan getMBeforePlanInfo() {
            return this.mBeforePlanInfo;
        }

        @aa1
        public final List<Integer> getMCompletionMark() {
            return this.mCompletionMark;
        }

        public final int getMProgress() {
            return this.mProgress;
        }

        @tb1
        public final List<VitalityLesson> getMVitalityDayLesson() {
            return this.mVitalityDayLesson;
        }

        public final float getPlanTarget() {
            return this.planTarget;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final int getUserAge() {
            return this.userAge;
        }

        public final int getWeeklyTargetNumber() {
            return this.weeklyTargetNumber;
        }

        public int hashCode() {
            int iHashCode = ((((((Float.hashCode(this.planTarget) * 31) + Integer.hashCode(this.level)) * 31) + this.generateParameter.hashCode()) * 31) + this.dailyParameter.hashCode()) * 31;
            List<VitalityLesson> list = this.mVitalityDayLesson;
            int iHashCode2 = (((((((((((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.weeklyTargetNumber)) * 31) + Long.hashCode(this.startTime)) * 31) + Arrays.hashCode(this.dailyTargets)) * 31) + this.dailySchedule.hashCode()) * 31) + this.mCompletionMark.hashCode()) * 31) + Integer.hashCode(this.mProgress)) * 31) + Integer.hashCode(this.mAllExerciseTime)) * 31) + Float.hashCode(this.mAll_METS)) * 31) + Integer.hashCode(this.mAllCalorie)) * 31;
            BleAICoachBeforePlan bleAICoachBeforePlan = this.mBeforePlanInfo;
            return ((iHashCode2 + (bleAICoachBeforePlan != null ? bleAICoachBeforePlan.hashCode() : 0)) * 31) + Integer.hashCode(this.userAge);
        }

        public final void setDailyParameter(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.dailyParameter = str;
        }

        public final void setDailySchedule(@aa1 List<Integer> list) {
            Intrinsics.X0O(list, "<set-?>");
            this.dailySchedule = list;
        }

        public final void setDailyTargets(@aa1 int[] iArr) {
            Intrinsics.X0O(iArr, "<set-?>");
            this.dailyTargets = iArr;
        }

        public final void setGenerateParameter(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.generateParameter = str;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setMAllCalorie(int i) {
            this.mAllCalorie = i;
        }

        public final void setMAllExerciseTime(int i) {
            this.mAllExerciseTime = i;
        }

        public final void setMAll_METS(float f) {
            this.mAll_METS = f;
        }

        public final void setMBeforePlanInfo(@tb1 BleAICoachBeforePlan bleAICoachBeforePlan) {
            this.mBeforePlanInfo = bleAICoachBeforePlan;
        }

        public final void setMCompletionMark(@aa1 List<Integer> list) {
            Intrinsics.X0O(list, "<set-?>");
            this.mCompletionMark = list;
        }

        public final void setMProgress(int i) {
            this.mProgress = i;
        }

        public final void setMVitalityDayLesson(@tb1 List<VitalityLesson> list) {
            this.mVitalityDayLesson = list;
        }

        public final void setPlanTarget(float f) {
            this.planTarget = f;
        }

        public final void setStartTime(long j) {
            this.startTime = j;
        }

        public final void setUserAge(int i) {
            this.userAge = i;
        }

        public final void setWeeklyTargetNumber(int i) {
            this.weeklyTargetNumber = i;
        }

        @aa1
        public String toString() {
            return "VitalityData(planTarget=" + this.planTarget + ", level=" + this.level + ", generateParameter=" + this.generateParameter + ", dailyParameter=" + this.dailyParameter + ", mVitalityDayLesson=" + this.mVitalityDayLesson + ", weeklyTargetNumber=" + this.weeklyTargetNumber + ", startTime=" + this.startTime + ", dailyTargets=" + Arrays.toString(this.dailyTargets) + ", dailySchedule=" + this.dailySchedule + ", mCompletionMark=" + this.mCompletionMark + ", mProgress=" + this.mProgress + ", mAllExerciseTime=" + this.mAllExerciseTime + ", mAll_METS=" + this.mAll_METS + ", mAllCalorie=" + this.mAllCalorie + ", mBeforePlanInfo=" + this.mBeforePlanInfo + ", userAge=" + this.userAge + I000IiI1O.C2156iO.f1007iO;
        }

        public VitalityData(float f, int i, @aa1 String generateParameter, @aa1 String dailyParameter, @tb1 List<VitalityLesson> list, int i2, long j, @aa1 int[] dailyTargets, @aa1 List<Integer> dailySchedule, @aa1 List<Integer> mCompletionMark, int i3, int i4, float f2, int i5, @tb1 BleAICoachBeforePlan bleAICoachBeforePlan, int i6) {
            Intrinsics.X0O(generateParameter, "generateParameter");
            Intrinsics.X0O(dailyParameter, "dailyParameter");
            Intrinsics.X0O(dailyTargets, "dailyTargets");
            Intrinsics.X0O(dailySchedule, "dailySchedule");
            Intrinsics.X0O(mCompletionMark, "mCompletionMark");
            this.planTarget = f;
            this.level = i;
            this.generateParameter = generateParameter;
            this.dailyParameter = dailyParameter;
            this.mVitalityDayLesson = list;
            this.weeklyTargetNumber = i2;
            this.startTime = j;
            this.dailyTargets = dailyTargets;
            this.dailySchedule = dailySchedule;
            this.mCompletionMark = mCompletionMark;
            this.mProgress = i3;
            this.mAllExerciseTime = i4;
            this.mAll_METS = f2;
            this.mAllCalorie = i5;
            this.mBeforePlanInfo = bleAICoachBeforePlan;
            this.userAge = i6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
        public /* synthetic */ VitalityData(float f, int i, String str, String str2, List list, int i2, long j, int[] iArr, List list2, List list3, int i3, int i4, float f2, int i5, BleAICoachBeforePlan bleAICoachBeforePlan, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            ?? arrayList;
            float f3 = (i7 & 1) != 0 ? 0.0f : f;
            int i8 = (i7 & 2) != 0 ? 1 : i;
            String str3 = (i7 & 4) != 0 ? "" : str;
            String str4 = (i7 & 8) == 0 ? str2 : "";
            List list4 = (i7 & 16) != 0 ? null : list;
            int i9 = (i7 & 32) != 0 ? 0 : i2;
            long j2 = (i7 & 64) != 0 ? 0L : j;
            int[] iArr2 = (i7 & 128) != 0 ? new int[]{0, 0, 37, 0, 44, 44, 0} : iArr;
            List listIi1iii0 = (i7 & 256) != 0 ? CollectionsKt__CollectionsKt.Ii1iii0(1, 1, 1, 0, 0, 0, 0, 1) : list2;
            if ((i7 & 512) != 0) {
                arrayList = new ArrayList(32);
                for (int i10 = 0; i10 < 32; i10++) {
                    arrayList.add(0);
                }
            } else {
                arrayList = list3;
            }
            this(f3, i8, str3, str4, list4, i9, j2, iArr2, listIi1iii0, arrayList, (i7 & 1024) != 0 ? 0 : i3, (i7 & 2048) != 0 ? 0 : i4, (i7 & 4096) != 0 ? 0.0f : f2, (i7 & 8192) != 0 ? 0 : i5, (i7 & 16384) != 0 ? null : bleAICoachBeforePlan, (i7 & 32768) != 0 ? 20 : i6);
        }
    }

    public static final class VitalityDayLesson extends JsonFieldContainer implements Serializable {
        private final int lessonCode;
        private final int lessonIcon;

        @aa1
        private final String lessonName;
        private float lessonTarget;
        private final int lessonTime;

        @aa1
        private final String lessonTitle;

        @tb1
        private final List<VitalityLessonIntervalLessons> mIntervalLessons;

        public VitalityDayLesson() {
            this(0, null, null, 0, 0, 0.0f, null, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VitalityDayLesson copy$default(VitalityDayLesson vitalityDayLesson, int i, String str, String str2, int i2, int i3, float f, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = vitalityDayLesson.lessonCode;
            }
            if ((i4 & 2) != 0) {
                str = vitalityDayLesson.lessonTitle;
            }
            if ((i4 & 4) != 0) {
                str2 = vitalityDayLesson.lessonName;
            }
            if ((i4 & 8) != 0) {
                i2 = vitalityDayLesson.lessonIcon;
            }
            if ((i4 & 16) != 0) {
                i3 = vitalityDayLesson.lessonTime;
            }
            if ((i4 & 32) != 0) {
                f = vitalityDayLesson.lessonTarget;
            }
            if ((i4 & 64) != 0) {
                list = vitalityDayLesson.mIntervalLessons;
            }
            float f2 = f;
            List list2 = list;
            int i5 = i3;
            String str3 = str2;
            return vitalityDayLesson.copy(i, str, str3, i2, i5, f2, list2);
        }

        public final int component1() {
            return this.lessonCode;
        }

        @aa1
        public final String component2() {
            return this.lessonTitle;
        }

        @aa1
        public final String component3() {
            return this.lessonName;
        }

        public final int component4() {
            return this.lessonIcon;
        }

        public final int component5() {
            return this.lessonTime;
        }

        public final float component6() {
            return this.lessonTarget;
        }

        @tb1
        public final List<VitalityLessonIntervalLessons> component7() {
            return this.mIntervalLessons;
        }

        @aa1
        public final VitalityDayLesson copy(int i, @aa1 String lessonTitle, @aa1 String lessonName, int i2, int i3, float f, @tb1 List<VitalityLessonIntervalLessons> list) {
            Intrinsics.X0O(lessonTitle, "lessonTitle");
            Intrinsics.X0O(lessonName, "lessonName");
            return new VitalityDayLesson(i, lessonTitle, lessonName, i2, i3, f, list);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalityDayLesson)) {
                return false;
            }
            VitalityDayLesson vitalityDayLesson = (VitalityDayLesson) obj;
            return this.lessonCode == vitalityDayLesson.lessonCode && Intrinsics.XOO0ii0(this.lessonTitle, vitalityDayLesson.lessonTitle) && Intrinsics.XOO0ii0(this.lessonName, vitalityDayLesson.lessonName) && this.lessonIcon == vitalityDayLesson.lessonIcon && this.lessonTime == vitalityDayLesson.lessonTime && Float.compare(this.lessonTarget, vitalityDayLesson.lessonTarget) == 0 && Intrinsics.XOO0ii0(this.mIntervalLessons, vitalityDayLesson.mIntervalLessons);
        }

        public final int getLessonCode() {
            return this.lessonCode;
        }

        public final int getLessonIcon() {
            return this.lessonIcon;
        }

        @aa1
        public final String getLessonName() {
            return this.lessonName;
        }

        public final float getLessonTarget() {
            return this.lessonTarget;
        }

        public final int getLessonTime() {
            return this.lessonTime;
        }

        @aa1
        public final String getLessonTitle() {
            return this.lessonTitle;
        }

        @tb1
        public final List<VitalityLessonIntervalLessons> getMIntervalLessons() {
            return this.mIntervalLessons;
        }

        public int hashCode() {
            int iHashCode = ((((((((((Integer.hashCode(this.lessonCode) * 31) + this.lessonTitle.hashCode()) * 31) + this.lessonName.hashCode()) * 31) + Integer.hashCode(this.lessonIcon)) * 31) + Integer.hashCode(this.lessonTime)) * 31) + Float.hashCode(this.lessonTarget)) * 31;
            List<VitalityLessonIntervalLessons> list = this.mIntervalLessons;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final void setLessonTarget(float f) {
            this.lessonTarget = f;
        }

        @aa1
        public String toString() {
            return "VitalityDayLesson(lessonCode=" + this.lessonCode + ", lessonTitle=" + this.lessonTitle + ", lessonName=" + this.lessonName + ", lessonIcon=" + this.lessonIcon + ", lessonTime=" + this.lessonTime + ", lessonTarget=" + this.lessonTarget + ", mIntervalLessons=" + this.mIntervalLessons + I000IiI1O.C2156iO.f1007iO;
        }

        public VitalityDayLesson(int i, @aa1 String lessonTitle, @aa1 String lessonName, int i2, int i3, float f, @tb1 List<VitalityLessonIntervalLessons> list) {
            Intrinsics.X0O(lessonTitle, "lessonTitle");
            Intrinsics.X0O(lessonName, "lessonName");
            this.lessonCode = i;
            this.lessonTitle = lessonTitle;
            this.lessonName = lessonName;
            this.lessonIcon = i2;
            this.lessonTime = i3;
            this.lessonTarget = f;
            this.mIntervalLessons = list;
        }

        public /* synthetic */ VitalityDayLesson(int i, String str, String str2, int i2, int i3, float f, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? 95.0f : f, (i4 & 64) != 0 ? null : list);
        }
    }

    public static final class VitalityLessonIntervalLessons extends JsonFieldContainer implements Serializable {
        private final int intenseMinutes;
        private final int lowerBoundHR;
        private final int repeatTimes;
        private final int restHR;
        private final int restMinutes;
        private final float target;
        private final int upperBoundHR;

        public VitalityLessonIntervalLessons() {
            this(0, 0, 0, 0, 0, 0, 0.0f, 127, null);
        }

        public static /* synthetic */ VitalityLessonIntervalLessons copy$default(VitalityLessonIntervalLessons vitalityLessonIntervalLessons, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i = vitalityLessonIntervalLessons.intenseMinutes;
            }
            if ((i7 & 2) != 0) {
                i2 = vitalityLessonIntervalLessons.restMinutes;
            }
            if ((i7 & 4) != 0) {
                i3 = vitalityLessonIntervalLessons.upperBoundHR;
            }
            if ((i7 & 8) != 0) {
                i4 = vitalityLessonIntervalLessons.lowerBoundHR;
            }
            if ((i7 & 16) != 0) {
                i5 = vitalityLessonIntervalLessons.restHR;
            }
            if ((i7 & 32) != 0) {
                i6 = vitalityLessonIntervalLessons.repeatTimes;
            }
            if ((i7 & 64) != 0) {
                f = vitalityLessonIntervalLessons.target;
            }
            int i8 = i6;
            float f2 = f;
            int i9 = i5;
            int i10 = i3;
            return vitalityLessonIntervalLessons.copy(i, i2, i10, i4, i9, i8, f2);
        }

        public final int component1() {
            return this.intenseMinutes;
        }

        public final int component2() {
            return this.restMinutes;
        }

        public final int component3() {
            return this.upperBoundHR;
        }

        public final int component4() {
            return this.lowerBoundHR;
        }

        public final int component5() {
            return this.restHR;
        }

        public final int component6() {
            return this.repeatTimes;
        }

        public final float component7() {
            return this.target;
        }

        @aa1
        public final VitalityLessonIntervalLessons copy(int i, int i2, int i3, int i4, int i5, int i6, float f) {
            return new VitalityLessonIntervalLessons(i, i2, i3, i4, i5, i6, f);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalityLessonIntervalLessons)) {
                return false;
            }
            VitalityLessonIntervalLessons vitalityLessonIntervalLessons = (VitalityLessonIntervalLessons) obj;
            return this.intenseMinutes == vitalityLessonIntervalLessons.intenseMinutes && this.restMinutes == vitalityLessonIntervalLessons.restMinutes && this.upperBoundHR == vitalityLessonIntervalLessons.upperBoundHR && this.lowerBoundHR == vitalityLessonIntervalLessons.lowerBoundHR && this.restHR == vitalityLessonIntervalLessons.restHR && this.repeatTimes == vitalityLessonIntervalLessons.repeatTimes && Float.compare(this.target, vitalityLessonIntervalLessons.target) == 0;
        }

        public final int getIntenseMinutes() {
            return this.intenseMinutes;
        }

        public final int getLowerBoundHR() {
            return this.lowerBoundHR;
        }

        public final int getRepeatTimes() {
            return this.repeatTimes;
        }

        public final int getRestHR() {
            return this.restHR;
        }

        public final int getRestMinutes() {
            return this.restMinutes;
        }

        public final float getTarget() {
            return this.target;
        }

        public final int getUpperBoundHR() {
            return this.upperBoundHR;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.intenseMinutes) * 31) + Integer.hashCode(this.restMinutes)) * 31) + Integer.hashCode(this.upperBoundHR)) * 31) + Integer.hashCode(this.lowerBoundHR)) * 31) + Integer.hashCode(this.restHR)) * 31) + Integer.hashCode(this.repeatTimes)) * 31) + Float.hashCode(this.target);
        }

        @aa1
        public String toString() {
            return "VitalityLessonIntervalLessons(intenseMinutes=" + this.intenseMinutes + ", restMinutes=" + this.restMinutes + ", upperBoundHR=" + this.upperBoundHR + ", lowerBoundHR=" + this.lowerBoundHR + ", restHR=" + this.restHR + ", repeatTimes=" + this.repeatTimes + ", target=" + this.target + I000IiI1O.C2156iO.f1007iO;
        }

        public VitalityLessonIntervalLessons(int i, int i2, int i3, int i4, int i5, int i6, float f) {
            this.intenseMinutes = i;
            this.restMinutes = i2;
            this.upperBoundHR = i3;
            this.lowerBoundHR = i4;
            this.restHR = i5;
            this.repeatTimes = i6;
            this.target = f;
        }

        public /* synthetic */ VitalityLessonIntervalLessons(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 136 : i3, (i7 & 8) != 0 ? 113 : i4, (i7 & 16) != 0 ? 104 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? 75.0f : f);
        }
    }

    static {
        AICoachManage aICoachManage;
        OXO1 oxo1 = new OXO1(null);
        IiI10X = oxo1;
        synchronized (oxo1) {
            aICoachManage = new AICoachManage();
            XOO0ii0 = aICoachManage;
        }
        XOO0ii0 = aICoachManage;
    }

    public static /* synthetic */ boolean I0IIOi(AICoachManage aICoachManage, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 28;
        }
        return aICoachManage.XOO0ii0(j, i);
    }

    public static final Unit IiI10X(AICoachManage aICoachManage, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.DELETE, 255, false, false, 24, null);
        a01.OXO1.IiI10X().remove(b01.O1i0 + '_' + VitalityData.class.getName(), false);
        aICoachManage.XIi00iiXO.setPlanTarget(0.0f);
        I01XX0.XIi00iiXO(I01XX0.XIO11I, null, 2, null);
        return Unit.OXO1;
    }

    public static /* synthetic */ void OiIIX101O(AICoachManage aICoachManage, int i, int i2, float f, float f2, int i3, int i4, float f3, float f4, String str, String str2, int i5, Object obj) {
        BleAICoachBeforePlan mBeforePlanInfo;
        BleAICoachBeforePlan mBeforePlanInfo2;
        if ((i5 & 16) != 0) {
            i3 = -1;
        }
        if ((i5 & 32) != 0) {
            i4 = -1;
        }
        if ((i5 & 64) != 0) {
            f3 = -1.0f;
        }
        if ((i5 & 128) != 0) {
            f4 = -1.0f;
        }
        if ((i5 & 256) != 0 && ((mBeforePlanInfo2 = aICoachManage.XIi00iiXO.getMBeforePlanInfo()) == null || (str = mBeforePlanInfo2.getMCurrentChecksum()) == null)) {
            str = "-999";
        }
        if ((i5 & 512) != 0 && ((mBeforePlanInfo = aICoachManage.XIi00iiXO.getMBeforePlanInfo()) == null || (str2 = mBeforePlanInfo.getMLastChecksum()) == null)) {
            str2 = "-999";
        }
        aICoachManage.XX0(i, i2, f, f2, i3, i4, f3, f4, str, str2);
    }

    @tb1
    public final BleAICoachGeneratePlan I0iXXO() {
        return this.XO0O10;
    }

    /* JADX INFO: renamed from: I1 */
    public final int m38664I1(@aa1 Calendar calendar) {
        Intrinsics.X0O(calendar, "calendar");
        switch (calendar.get(7)) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    public final boolean I1XOi1() {
        return this.O00;
    }

    public final void IIX1OXO() {
        int mAllCalorie;
        BleAICoachGeneratePlan bleAICoachGeneratePlan;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.XIi00iiXO.getStartTime());
        int i = calendar.get(7);
        int i2 = i - 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.XIi00iiXO.getMVitalityDayLesson() != null) {
            List<VitalityLesson> mVitalityDayLesson = this.XIi00iiXO.getMVitalityDayLesson();
            Intrinsics.XXI(mVitalityDayLesson);
            List<VitalityLesson> mVitalityDayLesson2 = this.XIi00iiXO.getMVitalityDayLesson();
            Intrinsics.XXI(mVitalityDayLesson2);
            arrayList2.addAll(mVitalityDayLesson.subList(i2, mVitalityDayLesson2.size()));
            List<VitalityLesson> mVitalityDayLesson3 = this.XIi00iiXO.getMVitalityDayLesson();
            Intrinsics.XXI(mVitalityDayLesson3);
            arrayList2.addAll(mVitalityDayLesson3.subList(0, i2));
        }
        int i3 = 0;
        for (Object obj : arrayList2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            VitalityLesson vitalityLesson = (VitalityLesson) obj;
            BleAICoachDayPlanCourse bleAICoachDayPlanCourse = new BleAICoachDayPlanCourse(0, null, 0, 0.0f, 15, null);
            if (vitalityLesson.getDayLesson().size() >= 5) {
                ArrayList arrayList3 = new ArrayList();
                bleAICoachDayPlanCourse.setMCourseNumber(vitalityLesson.getDayLesson().size());
                for (VitalityDayLesson vitalityDayLesson : vitalityLesson.getDayLesson()) {
                    BleAICoachCourse bleAICoachCourse = new BleAICoachCourse(0, 0.0f, 0, 0, 0, 0, 0, 0, 255, null);
                    bleAICoachCourse.setMCourseType(vitalityDayLesson.getLessonCode());
                    bleAICoachCourse.setMCourseGoal(vitalityDayLesson.getLessonTarget());
                    bleAICoachCourse.setMCourseTime(vitalityDayLesson.getLessonTime());
                    if (vitalityDayLesson.getMIntervalLessons() != null && !vitalityDayLesson.getMIntervalLessons().isEmpty()) {
                        bleAICoachCourse.setMCourseUpperBoundHR(vitalityDayLesson.getMIntervalLessons().get(0).getUpperBoundHR());
                        bleAICoachCourse.setMCourseLowerBoundHR(vitalityDayLesson.getMIntervalLessons().get(0).getLowerBoundHR());
                        if (vitalityDayLesson.getLessonCode() == 1) {
                            bleAICoachCourse.setMCourseTime(vitalityDayLesson.getMIntervalLessons().get(0).getIntenseMinutes());
                            bleAICoachCourse.setMRestMinutes(vitalityDayLesson.getMIntervalLessons().get(0).getRestMinutes());
                            bleAICoachCourse.setMCourseRestHR(vitalityDayLesson.getMIntervalLessons().get(0).getRestHR());
                            bleAICoachCourse.setMRepeatTimes(vitalityDayLesson.getMIntervalLessons().get(0).getRepeatTimes());
                        }
                    }
                    arrayList3.add(bleAICoachCourse);
                }
                if (vitalityLesson.getDayLesson().size() == 5) {
                    arrayList3.add(new BleAICoachCourse(0, 0.0f, 0, 0, 0, 0, 0, 0, 255, null));
                }
                bleAICoachDayPlanCourse.setMCoursesItem(arrayList3);
                bleAICoachDayPlanCourse.setMCourseIndex(0);
                bleAICoachDayPlanCourse.setMCourseGoal(vitalityLesson.getDayLesson().get(0).getLessonTarget());
                arrayList.add(bleAICoachDayPlanCourse);
            } else {
                arrayList.add(bleAICoachDayPlanCourse);
            }
            i3 = i4;
        }
        ArrayList arrayList4 = new ArrayList(32);
        for (int i5 = 0; i5 < 32; i5++) {
            arrayList4.add(0);
        }
        List<Integer> listSubList = this.XIi00iiXO.getDailySchedule().subList(0, 7);
        int i6 = i + 27;
        for (int i7 = i2; i7 < i6; i7++) {
            arrayList4.set(i7 - i2, listSubList.get(i7 % 7));
        }
        ArrayList arrayList5 = new ArrayList(32);
        for (int i8 = 0; i8 < 32; i8++) {
            arrayList5.add(0);
        }
        BleAICoachGeneratePlan bleAICoachGeneratePlan2 = this.XO0O10;
        List<Integer> mCompletionMark = arrayList5;
        if (bleAICoachGeneratePlan2 != null) {
            Intrinsics.XXI(bleAICoachGeneratePlan2);
            mCompletionMark = bleAICoachGeneratePlan2.getMCompletionMark();
        }
        int mProgress = this.XIi00iiXO.getMProgress();
        int mAllExerciseTime = this.XIi00iiXO.getMAllExerciseTime();
        float mAll_METS = this.XIi00iiXO.getMAll_METS();
        int mAllCalorie2 = this.XIi00iiXO.getMAllCalorie();
        if (!this.O00 || (bleAICoachGeneratePlan = this.XO0O10) == null) {
            mAllCalorie = mAllCalorie2;
        } else {
            mProgress = bleAICoachGeneratePlan != null ? bleAICoachGeneratePlan.getMProgress() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlan3 = this.XO0O10;
            mAllExerciseTime = bleAICoachGeneratePlan3 != null ? bleAICoachGeneratePlan3.getMAllExerciseTime() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlan4 = this.XO0O10;
            mAll_METS = bleAICoachGeneratePlan4 != null ? bleAICoachGeneratePlan4.getMAll_METS() : 0.0f;
            BleAICoachGeneratePlan bleAICoachGeneratePlan5 = this.XO0O10;
            mAllCalorie = bleAICoachGeneratePlan5 != null ? bleAICoachGeneratePlan5.getMAllCalorie() : 0;
        }
        BleAICoachGeneratePlan bleAICoachGeneratePlan6 = new BleAICoachGeneratePlan(arrayList4, mCompletionMark, this.XIi00iiXO.getStartTime(), this.XIi00iiXO.getPlanTarget(), this.XIi00iiXO.getLevel(), arrayList, mProgress, mAllExerciseTime, mAll_METS, mAllCalorie);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " sendObject item item = " + bleAICoachGeneratePlan6);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.UPDATE, bleAICoachGeneratePlan6, false, false, 24, null);
    }

    /* JADX INFO: renamed from: IO */
    public final String m38665IO(Calendar calendar) {
        switch (calendar.get(7)) {
            case 2:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday1_s);
            case 3:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday2_s);
            case 4:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday3_s);
            case 5:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday4_s);
            case 6:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday5_s);
            case 7:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday6_s);
            default:
                return UtilsKt.XXO(R.string.abh_plan_label_weekday7_s);
        }
    }

    public final void O00() {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O0O0X0iOi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AICoachManage.IiI10X(this.f2480IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @aa1
    public final Pair<List<String>, List<String>> O10IXXX0X() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.XIi00iiXO.getStartTime());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(O0X11OiO.OII, Locale.getDefault());
        AICoachManage aICoachManage = XOO0ii0;
        Intrinsics.XXI(calendar);
        int iM38664I1 = aICoachManage.m38664I1(calendar);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(ArraysKt___ArraysKt.OOX0iOi00(this.XIi00iiXO.getDailyTargets()).subList(iM38664I1, this.XIi00iiXO.getDailyTargets().length));
        arrayList3.addAll(ArraysKt___ArraysKt.OOX0iOi00(this.XIi00iiXO.getDailyTargets()).subList(0, iM38664I1));
        for (int i = 0; i < 7; i++) {
            if (i != 0) {
                calendar.add(6, 1);
            }
            arrayList.add(simpleDateFormat.format(calendar.getTime()) + " (" + m38665IO(calendar) + I000IiI1O.C2156iO.f1007iO);
            if (((Number) arrayList3.get(i)).intValue() > 0) {
                arrayList2.add(arrayList3.get(i) + " " + UtilsKt.XXO(R.string.abh_mets_unit));
            } else {
                arrayList2.add(String.valueOf(UtilsKt.XXO(R.string.abh_rest_day)));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public final void OII(@tb1 BleAICoachGeneratePlan bleAICoachGeneratePlan) {
        this.XO0O10 = bleAICoachGeneratePlan;
    }

    public final void OIX0iXi(int i) {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.READ, i, false, false, 24, null);
    }

    public final void OIi0() {
    }

    /* JADX INFO: renamed from: OX */
    public final void m38666OX(@tb1 List<PlanGroupTitle> list) {
        this.f54786iO = list;
    }

    public final void X01IiOiIi() {
    }

    @aa1
    public final VitalityData X0O() {
        return this.XIi00iiXO;
    }

    public final void X1ii() {
        this.f54786iO = new ArrayList();
        if (this.XIi00iiXO.getMCompletionMark().isEmpty() || this.XIi00iiXO.getMCompletionMark().size() < 32) {
            BleAICoachGeneratePlan bleAICoachGeneratePlan = this.XO0O10;
            if (bleAICoachGeneratePlan != null) {
                VitalityData vitalityData = this.XIi00iiXO;
                Intrinsics.XXI(bleAICoachGeneratePlan);
                vitalityData.setMCompletionMark(bleAICoachGeneratePlan.getMCompletionMark());
            } else {
                VitalityData vitalityData2 = this.XIi00iiXO;
                ArrayList arrayList = new ArrayList(32);
                for (int i = 0; i < 32; i++) {
                    arrayList.add(0);
                }
                vitalityData2.setMCompletionMark(arrayList);
            }
        }
        if (this.XIi00iiXO.getDailySchedule().size() < 6) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.XIi00iiXO.getStartTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormatUtils.f55445DD, Locale.getDefault());
        boolean z = false;
        for (int i2 = calendar.get(7) - 1; i2 > 0; i2--) {
            if (i2 > 0 && this.XIi00iiXO.getDailySchedule().get(i2 - 1).intValue() == 1) {
                z = true;
            }
            calendar.add(6, -1);
            Intrinsics.XXI(calendar);
            String strM38665IO = m38665IO(calendar);
            List<PlanGroupTitle> list = this.f54786iO;
            Intrinsics.XXI(list);
            String str = simpleDateFormat.format(calendar.getTime());
            Intrinsics.O10IXXX0X(str, "format(...)");
            list.add(0, new PlanGroupTitle(strM38665IO, str, false, false, 0, null, 56, null));
        }
        int iIntValue = ((Number) CollectionsKt___CollectionsKt.Xi1XO00(this.XIi00iiXO.getDailySchedule())).intValue();
        calendar.setTimeInMillis(this.XIi00iiXO.getStartTime());
        if (!z) {
            List<PlanGroupTitle> list2 = this.f54786iO;
            Intrinsics.XXI(list2);
            int size = list2.size();
            for (int i3 = size; i3 < 28; i3++) {
                if (i3 != size) {
                    calendar.add(6, 1);
                }
                List<PlanGroupTitle> list3 = this.f54786iO;
                Intrinsics.XXI(list3);
                Intrinsics.XXI(calendar);
                String strM38665IO2 = m38665IO(calendar);
                String str2 = simpleDateFormat.format(calendar.getTime());
                Intrinsics.O10IXXX0X(str2, "format(...)");
                list3.add(new PlanGroupTitle(strM38665IO2, str2, true, OiOX0i.XIi00iiXO(this.XIi00iiXO.getMCompletionMark().get(i3 - size).intValue()), (i3 + iIntValue) - 1, null, 32, null));
            }
            return;
        }
        List<PlanGroupTitle> list4 = this.f54786iO;
        Intrinsics.XXI(list4);
        int size2 = list4.size();
        int i4 = size2 + 28;
        for (int i5 = size2; i5 < i4; i5++) {
            if (i5 != size2) {
                calendar.add(6, 1);
            }
            List<PlanGroupTitle> list5 = this.f54786iO;
            Intrinsics.XXI(list5);
            Intrinsics.XXI(calendar);
            String strM38665IO3 = m38665IO(calendar);
            String str3 = simpleDateFormat.format(calendar.getTime());
            Intrinsics.O10IXXX0X(str3, "format(...)");
            list5.add(new PlanGroupTitle(strM38665IO3, str3, true, OiOX0i.XIi00iiXO(this.XIi00iiXO.getMCompletionMark().get(i5 - size2).intValue()), i5, null, 32, null));
        }
        int i6 = 7 - size2;
        for (int i7 = 0; i7 < i6; i7++) {
            calendar.add(6, 1);
            List<PlanGroupTitle> list6 = this.f54786iO;
            Intrinsics.XXI(list6);
            Intrinsics.XXI(calendar);
            String strM38665IO4 = m38665IO(calendar);
            String str4 = simpleDateFormat.format(calendar.getTime());
            Intrinsics.O10IXXX0X(str4, "format(...)");
            list6.add(new PlanGroupTitle(strM38665IO4, str4, false, false, 0, null, 56, null));
        }
    }

    public final void XO0O10() {
    }

    public final boolean XOO0ii0(long j, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return jCurrentTimeMillis < ((long) (i * 86400000)) && jCurrentTimeMillis > 0;
    }

    public final void XX0(int i, int i2, float f, float f2, int i3, int i4, float f3, float f4, @aa1 String currentChecksum, @aa1 String lastChecksum) {
        Intrinsics.X0O(currentChecksum, "currentChecksum");
        Intrinsics.X0O(lastChecksum, "lastChecksum");
    }

    @tb1
    public final List<PlanGroupTitle> XXI() {
        return this.f54786iO;
    }

    public final void XiOIO(@aa1 BleAICoachGeneratePlan plan) {
        Intrinsics.X0O(plan, "plan");
        this.XO0O10 = plan;
        this.XIi00iiXO.setMProgress(plan.getMProgress());
        this.XIi00iiXO.setMAllExerciseTime(plan.getMAllExerciseTime());
        this.XIi00iiXO.setMAll_METS(plan.getMAll_METS());
        this.XIi00iiXO.setMAllCalorie(plan.getMAllCalorie());
        this.XIi00iiXO.setMCompletionMark(plan.getMCompletionMark());
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.O1i0 + '_' + VitalityData.class.getName(), new Gson().toJson(this.XIi00iiXO), false);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setAICoachGeneratePlan = " + this.XO0O10);
        long j = (long) 1000;
        if (plan.getMPlanStartTime() / j != this.XIi00iiXO.getStartTime() / j || this.XIi00iiXO.getStartTime() == 0) {
            if (this.XIi00iiXO.getStartTime() == 0 || this.XIi00iiXO.getPlanTarget() <= 0.0f) {
                return;
            }
            this.O00 = false;
            IIX1OXO();
            return;
        }
        long j2 = a01Var.IiI10X().getLong(b01.OXI0Xi, 0L);
        if (j2 <= 0 || !XOO0ii0(j2, 1)) {
            return;
        }
        X01IiOiIi();
        this.O00 = true;
        IIX1OXO();
    }

    public final void XiOIii1(boolean z) {
        this.O00 = z;
    }

    public final void iIiiO(@aa1 BleAICoachBeforePlan info) {
        Intrinsics.X0O(info, "info");
        this.XIi00iiXO.setMBeforePlanInfo(info);
    }

    public final void iOOX010X(@aa1 VitalityData data) {
        Intrinsics.X0O(data, "data");
        this.XIi00iiXO = data;
    }

    public static final class VitalityLesson extends JsonFieldContainer implements Serializable {

        @aa1
        private final String day;

        @aa1
        private List<VitalityDayLesson> dayLesson;
        private final int isCompletion;

        public VitalityLesson(@aa1 String day, int i, @aa1 List<VitalityDayLesson> dayLesson) {
            Intrinsics.X0O(day, "day");
            Intrinsics.X0O(dayLesson, "dayLesson");
            this.day = day;
            this.isCompletion = i;
            this.dayLesson = dayLesson;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VitalityLesson copy$default(VitalityLesson vitalityLesson, String str, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = vitalityLesson.day;
            }
            if ((i2 & 2) != 0) {
                i = vitalityLesson.isCompletion;
            }
            if ((i2 & 4) != 0) {
                list = vitalityLesson.dayLesson;
            }
            return vitalityLesson.copy(str, i, list);
        }

        @aa1
        public final String component1() {
            return this.day;
        }

        public final int component2() {
            return this.isCompletion;
        }

        @aa1
        public final List<VitalityDayLesson> component3() {
            return this.dayLesson;
        }

        @aa1
        public final VitalityLesson copy(@aa1 String day, int i, @aa1 List<VitalityDayLesson> dayLesson) {
            Intrinsics.X0O(day, "day");
            Intrinsics.X0O(dayLesson, "dayLesson");
            return new VitalityLesson(day, i, dayLesson);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalityLesson)) {
                return false;
            }
            VitalityLesson vitalityLesson = (VitalityLesson) obj;
            return Intrinsics.XOO0ii0(this.day, vitalityLesson.day) && this.isCompletion == vitalityLesson.isCompletion && Intrinsics.XOO0ii0(this.dayLesson, vitalityLesson.dayLesson);
        }

        @aa1
        public final String getDay() {
            return this.day;
        }

        @aa1
        public final List<VitalityDayLesson> getDayLesson() {
            return this.dayLesson;
        }

        public int hashCode() {
            return (((this.day.hashCode() * 31) + Integer.hashCode(this.isCompletion)) * 31) + this.dayLesson.hashCode();
        }

        public final int isCompletion() {
            return this.isCompletion;
        }

        public final void setDayLesson(@aa1 List<VitalityDayLesson> list) {
            Intrinsics.X0O(list, "<set-?>");
            this.dayLesson = list;
        }

        @aa1
        public String toString() {
            return "VitalityLesson(day=" + this.day + ", isCompletion=" + this.isCompletion + ", dayLesson=" + this.dayLesson + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ VitalityLesson(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "0" : str, (i2 & 2) != 0 ? 0 : i, list);
        }
    }
}
