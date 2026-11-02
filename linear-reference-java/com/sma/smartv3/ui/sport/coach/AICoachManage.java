package com.sma.smartv3.ui.sport.coach;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0O0X0iOi;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,710:1\n1878#2,2:711\n1869#2,2:713\n1880#2:715\n1#3:716\n85#4,3:717\n97#4,3:720\n*S KotlinDebug\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n*L\n176#1:711,2\n181#1:713,2\n176#1:715\n667#1:717,3\n150#1:720,3\n*E\n"})
public final class AICoachManage {
    public static final int I0IIOi = 0;
    public static final int I0iXXO = 4;
    public static final int IO = 2;

    @aa1
    public static final OXO1 IiI10X = null;
    public static final int OIX0iXi = 3;
    public static final int OIi0 = 1;

    @aa1
    public static volatile AICoachManage XOO0ii0 = null;
    public static final int XXI = 5;
    public boolean O00;

    @aa1
    public final String OXO1;

    @aa1
    public VitalityData XIi00iiXO;

    @tb1
    public BleAICoachGeneratePlan XO0O10;

    @tb1
    public List<PlanGroupTitle> iO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final AICoachManage OXO1() {
            return AICoachManage.XIi00iiXO();
        }

        public final void XIi00iiXO(@aa1 AICoachManage r2) {
            Intrinsics.X0O(r2, "<set-?>");
            AICoachManage.iO(r2);
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
            String r1 = null;
            String r2 = null;
            boolean r3 = false;
            boolean r4 = false;
            int r5 = 0;
            String r6 = null;
            this(r1, r2, r3, r4, r5, r6, 63, null);
        }

        public static /* synthetic */ PlanGroupTitle copy$default(PlanGroupTitle r0, String r1, String r2, boolean r3, boolean r4, int r5, String r6, int r7, Object r8) {
            if ((r7 & 1) == 0) goto L6;
            r1 = r0.ofWeek;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r2 = r0.timeDay;
        L9:
            if ((r7 & 4) == 0) goto L12;
            r3 = r0.isHaveLesson;
        L12:
            if ((r7 & 8) == 0) goto L15;
            r4 = r0.isCompleted;
        L15:
            if ((r7 & 16) == 0) goto L18;
            r5 = r0.mLessonIndex;
        L18:
            if ((r7 & 32) == 0) goto L20;
            r6 = r0.remarks;
        L20:
            int r9 = r5;
            String r10 = r6;
            boolean r11 = r3;
            boolean r12 = r4;
            return r0.copy(r1, r2, r11, r12, r9, r10);
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
        public final PlanGroupTitle copy(@aa1 String r9, @aa1 String r10, boolean r11, boolean r12, int r13, @aa1 String r14) {
            Intrinsics.X0O(r9, "ofWeek");
            Intrinsics.X0O(r10, "timeDay");
            Intrinsics.X0O(r14, "remarks");
            return new PlanGroupTitle(r9, r10, r11, r12, r13, r14);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof PlanGroupTitle) == true) goto L8;
            return false;
        L8:
            PlanGroupTitle r6 = (PlanGroupTitle) r5;
            if (Intrinsics.XOO0ii0(this.ofWeek, r6.ofWeek) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.timeDay, r6.timeDay) == true) goto L15;
            return false;
        L15:
            if (this.isHaveLesson == r6.isHaveLesson) goto L18;
            return false;
        L18:
            if (this.isCompleted == r6.isCompleted) goto L21;
            return false;
        L21:
            if (this.mLessonIndex == r6.mLessonIndex) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.remarks, r6.remarks) == true) goto L26;
            return false;
        L26:
            return true;
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

        public final void setCompleted(boolean r1) {
            this.isCompleted = r1;
        }

        public final void setHaveLesson(boolean r1) {
            this.isHaveLesson = r1;
        }

        public final void setMLessonIndex(int r1) {
            this.mLessonIndex = r1;
        }

        public final void setOfWeek(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.ofWeek = r2;
        }

        public final void setRemarks(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.remarks = r2;
        }

        public final void setTimeDay(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.timeDay = r2;
        }

        @aa1
        public String toString() {
            return "PlanGroupTitle(ofWeek=" + this.ofWeek + ", timeDay=" + this.timeDay + ", isHaveLesson=" + this.isHaveLesson + ", isCompleted=" + this.isCompleted + ", mLessonIndex=" + this.mLessonIndex + ", remarks=" + this.remarks + I000IiI1O.iO.iO;
        }

        public PlanGroupTitle(@aa1 String r2, @aa1 String r3, boolean r4, boolean r5, int r6, @aa1 String r7) {
            Intrinsics.X0O(r2, "ofWeek");
            Intrinsics.X0O(r3, "timeDay");
            Intrinsics.X0O(r7, "remarks");
            this.ofWeek = r2;
            this.timeDay = r3;
            this.isHaveLesson = r4;
            this.isCompleted = r5;
            this.mLessonIndex = r6;
            this.remarks = r7;
        }

        public /* synthetic */ PlanGroupTitle(String r2, String r3, boolean r4, boolean r5, int r6, String r7, int r8, DefaultConstructorMarker r9) {
            if ((r8 & 1) == 0) goto L6;
            r2 = "周日";
        L6:
            if ((r8 & 2) == 0) goto L9;
            r3 = "01";
        L9:
            if ((r8 & 4) == 0) goto L12;
            r4 = false;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r5 = false;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r6 = -1;
        L18:
            if ((r8 & 32) == 0) goto L20;
            r7 = "";
        L20:
            int r10 = r6;
            String r11 = r7;
            this(r2, r3, r4, r5, r10, r11);
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
            float r1 = 0.0f;
            int r2 = 0;
            String r3 = null;
            String r4 = null;
            List r5 = null;
            int r6 = 0;
            long r7 = 0;
            int[] r9 = null;
            List r10 = null;
            List r11 = null;
            int r12 = 0;
            int r13 = 0;
            float r14 = 0.0f;
            int r15 = 0;
            BleAICoachBeforePlan r16 = null;
            int r17 = 0;
            this(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, 65535, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VitalityData copy$default(VitalityData r17, float r18, int r19, String r20, String r21, List r22, int r23, long r24, int[] r26, List r27, List r28, int r29, int r30, float r31, int r32, BleAICoachBeforePlan r33, int r34, int r35, Object r36) {
            if ((r35 & 1) == 0) goto L5;
            float r2 = r17.planTarget;
        L7:
            if ((r35 & 2) == 0) goto L9;
            int r3 = r17.level;
        L11:
            if ((r35 & 4) == 0) goto L13;
            String r4 = r17.generateParameter;
        L15:
            if ((r35 & 8) == 0) goto L17;
            String r5 = r17.dailyParameter;
        L19:
            if ((r35 & 16) == 0) goto L21;
            List r6 = r17.mVitalityDayLesson;
        L23:
            if ((r35 & 32) == 0) goto L25;
            int r7 = r17.weeklyTargetNumber;
        L27:
            if ((r35 & 64) == 0) goto L29;
            long r8 = r17.startTime;
        L31:
            if ((r35 & 128) == 0) goto L33;
            int[] r10 = r17.dailyTargets;
        L35:
            if ((r35 & 256) == 0) goto L37;
            List r11 = r17.dailySchedule;
        L39:
            if ((r35 & 512) == 0) goto L41;
            List r12 = r17.mCompletionMark;
        L43:
            if ((r35 & 1024) == 0) goto L45;
            int r13 = r17.mProgress;
        L47:
            if ((r35 & 2048) == 0) goto L49;
            int r14 = r17.mAllExerciseTime;
        L51:
            if ((r35 & 4096) == 0) goto L53;
            float r15 = r17.mAll_METS;
        L54:
            float r110 = r2;
            if ((r35 & 8192) == 0) goto L57;
            int r9 = r17.mAllCalorie;
        L58:
            int r111 = r9;
            if ((r35 & 16384) == 0) goto L61;
            BleAICoachBeforePlan r16 = r17.mBeforePlanInfo;
        L63:
            if ((r35 & 32768) == 0) goto L66;
            int r37 = r17.userAge;
        L68:
            return r17.copy(r110, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r111, r16, r37);
        L66:
            r37 = r34;
            goto L68
        L61:
            r16 = r33;
            goto L63
        L57:
            r9 = r32;
            goto L58
        L53:
            r15 = r31;
            goto L54
        L49:
            r14 = r30;
            goto L51
        L45:
            r13 = r29;
            goto L47
        L41:
            r12 = r28;
            goto L43
        L37:
            r11 = r27;
            goto L39
        L33:
            r10 = r26;
            goto L35
        L29:
            r8 = r24;
            goto L31
        L25:
            r7 = r23;
            goto L27
        L21:
            r6 = r22;
            goto L23
        L17:
            r5 = r21;
            goto L19
        L13:
            r4 = r20;
            goto L15
        L9:
            r3 = r19;
            goto L11
        L5:
            r2 = r18;
            goto L7
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
        public final VitalityData copy(float r20, int r21, @aa1 String r22, @aa1 String r23, @tb1 List<VitalityLesson> r24, int r25, long r26, @aa1 int[] r28, @aa1 List<Integer> r29, @aa1 List<Integer> r30, int r31, int r32, float r33, int r34, @tb1 BleAICoachBeforePlan r35, int r36) {
            Intrinsics.X0O(r22, "generateParameter");
            Intrinsics.X0O(r23, "dailyParameter");
            Intrinsics.X0O(r28, "dailyTargets");
            Intrinsics.X0O(r29, "dailySchedule");
            Intrinsics.X0O(r30, "mCompletionMark");
            return new VitalityData(r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36);
        }

        public boolean equals(@tb1 Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof VitalityData) == true) goto L8;
            return false;
        L8:
            VitalityData r9 = (VitalityData) r8;
            if (Float.compare(this.planTarget, r9.planTarget) == 0) goto L12;
            return false;
        L12:
            if (this.level == r9.level) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.generateParameter, r9.generateParameter) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.dailyParameter, r9.dailyParameter) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.mVitalityDayLesson, r9.mVitalityDayLesson) == true) goto L24;
            return false;
        L24:
            if (this.weeklyTargetNumber == r9.weeklyTargetNumber) goto L27;
            return false;
        L27:
            if (this.startTime == r9.startTime) goto L30;
            return false;
        L30:
            if (Intrinsics.XOO0ii0(this.dailyTargets, r9.dailyTargets) == true) goto L33;
            return false;
        L33:
            if (Intrinsics.XOO0ii0(this.dailySchedule, r9.dailySchedule) == true) goto L36;
            return false;
        L36:
            if (Intrinsics.XOO0ii0(this.mCompletionMark, r9.mCompletionMark) == true) goto L39;
            return false;
        L39:
            if (this.mProgress == r9.mProgress) goto L42;
            return false;
        L42:
            if (this.mAllExerciseTime == r9.mAllExerciseTime) goto L45;
            return false;
        L45:
            if (Float.compare(this.mAll_METS, r9.mAll_METS) == 0) goto L48;
            return false;
        L48:
            if (this.mAllCalorie == r9.mAllCalorie) goto L51;
            return false;
        L51:
            if (Intrinsics.XOO0ii0(this.mBeforePlanInfo, r9.mBeforePlanInfo) == true) goto L54;
            return false;
        L54:
            if (this.userAge == r9.userAge) goto L56;
            return false;
        L56:
            return true;
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
            int r0 = ((((((Float.hashCode(this.planTarget) * 31) + Integer.hashCode(this.level)) * 31) + this.generateParameter.hashCode()) * 31) + this.dailyParameter.hashCode()) * 31;
            List<VitalityLesson> r1 = this.mVitalityDayLesson;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r3 = 0;
        L6:
            int r4 = (((((((((((((((((((r0 + r3) * 31) + Integer.hashCode(this.weeklyTargetNumber)) * 31) + Long.hashCode(this.startTime)) * 31) + Arrays.hashCode(this.dailyTargets)) * 31) + this.dailySchedule.hashCode()) * 31) + this.mCompletionMark.hashCode()) * 31) + Integer.hashCode(this.mProgress)) * 31) + Integer.hashCode(this.mAllExerciseTime)) * 31) + Float.hashCode(this.mAll_METS)) * 31) + Integer.hashCode(this.mAllCalorie)) * 31;
            BleAICoachBeforePlan r5 = this.mBeforePlanInfo;
            if (r5 == null) goto L11;
            r2 = r5.hashCode();
        L11:
            return ((r4 + r2) * 31) + Integer.hashCode(this.userAge);
        L5:
            r3 = r1.hashCode();
            goto L6
        }

        public final void setDailyParameter(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.dailyParameter = r2;
        }

        public final void setDailySchedule(@aa1 List<Integer> r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.dailySchedule = r2;
        }

        public final void setDailyTargets(@aa1 int[] r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.dailyTargets = r2;
        }

        public final void setGenerateParameter(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.generateParameter = r2;
        }

        public final void setLevel(int r1) {
            this.level = r1;
        }

        public final void setMAllCalorie(int r1) {
            this.mAllCalorie = r1;
        }

        public final void setMAllExerciseTime(int r1) {
            this.mAllExerciseTime = r1;
        }

        public final void setMAll_METS(float r1) {
            this.mAll_METS = r1;
        }

        public final void setMBeforePlanInfo(@tb1 BleAICoachBeforePlan r1) {
            this.mBeforePlanInfo = r1;
        }

        public final void setMCompletionMark(@aa1 List<Integer> r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mCompletionMark = r2;
        }

        public final void setMProgress(int r1) {
            this.mProgress = r1;
        }

        public final void setMVitalityDayLesson(@tb1 List<VitalityLesson> r1) {
            this.mVitalityDayLesson = r1;
        }

        public final void setPlanTarget(float r1) {
            this.planTarget = r1;
        }

        public final void setStartTime(long r1) {
            this.startTime = r1;
        }

        public final void setUserAge(int r1) {
            this.userAge = r1;
        }

        public final void setWeeklyTargetNumber(int r1) {
            this.weeklyTargetNumber = r1;
        }

        @aa1
        public String toString() {
            return "VitalityData(planTarget=" + this.planTarget + ", level=" + this.level + ", generateParameter=" + this.generateParameter + ", dailyParameter=" + this.dailyParameter + ", mVitalityDayLesson=" + this.mVitalityDayLesson + ", weeklyTargetNumber=" + this.weeklyTargetNumber + ", startTime=" + this.startTime + ", dailyTargets=" + Arrays.toString(this.dailyTargets) + ", dailySchedule=" + this.dailySchedule + ", mCompletionMark=" + this.mCompletionMark + ", mProgress=" + this.mProgress + ", mAllExerciseTime=" + this.mAllExerciseTime + ", mAll_METS=" + this.mAll_METS + ", mAllCalorie=" + this.mAllCalorie + ", mBeforePlanInfo=" + this.mBeforePlanInfo + ", userAge=" + this.userAge + I000IiI1O.iO.iO;
        }

        public VitalityData(float r2, int r3, @aa1 String r4, @aa1 String r5, @tb1 List<VitalityLesson> r6, int r7, long r8, @aa1 int[] r10, @aa1 List<Integer> r11, @aa1 List<Integer> r12, int r13, int r14, float r15, int r16, @tb1 BleAICoachBeforePlan r17, int r18) {
            Intrinsics.X0O(r4, "generateParameter");
            Intrinsics.X0O(r5, "dailyParameter");
            Intrinsics.X0O(r10, "dailyTargets");
            Intrinsics.X0O(r11, "dailySchedule");
            Intrinsics.X0O(r12, "mCompletionMark");
            this.planTarget = r2;
            this.level = r3;
            this.generateParameter = r4;
            this.dailyParameter = r5;
            this.mVitalityDayLesson = r6;
            this.weeklyTargetNumber = r7;
            this.startTime = r8;
            this.dailyTargets = r10;
            this.dailySchedule = r11;
            this.mCompletionMark = r12;
            this.mProgress = r13;
            this.mAllExerciseTime = r14;
            this.mAll_METS = r15;
            this.mAllCalorie = r16;
            this.mBeforePlanInfo = r17;
            this.userAge = r18;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
        public /* synthetic */ VitalityData(float r22, int r23, String r24, String r25, List r26, int r27, long r28, int[] r30, List r31, List r32, int r33, int r34, float r35, int r36, BleAICoachBeforePlan r37, int r38, int r39, DefaultConstructorMarker r40) {
            if ((r39 & 1) == 0) goto L5;
            float r1 = 0.0f;
        L7:
            if ((r39 & 2) == 0) goto L9;
            int r3 = 1;
        L10:
            String r6 = "";
            if ((r39 & 4) == 0) goto L13;
            String r5 = "";
        L15:
            if ((r39 & 8) != 0) goto L19;
            r6 = r25;
        L19:
            if ((r39 & 16) == 0) goto L21;
            List r7 = null;
        L23:
            if ((r39 & 32) == 0) goto L25;
            int r9 = 0;
        L27:
            if ((r39 & 64) == 0) goto L29;
            long r11 = 0;
        L31:
            if ((r39 & 128) == 0) goto L33;
            int[] r13 = {0, 0, 37, 0, 44, 44, 0};
        L35:
            if ((r39 & 256) == 0) goto L37;
            List r4 = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{1, 1, 1, 0, 0, 0, 0, 1});
        L39:
            if ((r39 & 512) == 0) goto L43;
            ?? r14 = new ArrayList(32);
            int r2 = 0;
        L41:
            if (r2 >= 32) goto L45;
            r14.add(0);
            r2 = r2 + 1;
        L45:
            if ((r39 & 1024) == 0) goto L47;
            int r8 = 0;
        L49:
            if ((r39 & 2048) == 0) goto L51;
            int r10 = 0;
        L53:
            if ((r39 & 4096) == 0) goto L55;
            float r15 = 0.0f;
        L57:
            if ((r39 & 8192) == 0) goto L59;
            int r12 = 0;
        L60:
            float r41 = r1;
            if ((r39 & 16384) == 0) goto L63;
            BleAICoachBeforePlan r16 = null;
        L65:
            if ((r39 & 32768) == 0) goto L68;
            int r310 = 20;
        L69:
            this(r41, r3, r5, r6, r7, r9, r11, r13, r4, r14, r8, r10, r15, r12, r16, r310);
            return;
        L68:
            r310 = r38;
            goto L69
        L63:
            r16 = r37;
            goto L65
        L59:
            r12 = r36;
            goto L60
        L55:
            r15 = r35;
            goto L57
        L51:
            r10 = r34;
            goto L53
        L47:
            r8 = r33;
            goto L49
        L43:
            r14 = r32;
            goto L45
        L37:
            r4 = r31;
            goto L39
        L33:
            r13 = r30;
            goto L35
        L29:
            r11 = r28;
            goto L31
        L25:
            r9 = r27;
            goto L27
        L21:
            r7 = r26;
            goto L23
        L13:
            r5 = r24;
            goto L15
        L9:
            r3 = r23;
            goto L10
        L5:
            r1 = r22;
            goto L7
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
            int r1 = 0;
            String r2 = null;
            String r3 = null;
            int r4 = 0;
            int r5 = 0;
            float r6 = 0.0f;
            List r7 = null;
            this(r1, r2, r3, r4, r5, r6, r7, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VitalityDayLesson copy$default(VitalityDayLesson r0, int r1, String r2, String r3, int r4, int r5, float r6, List r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.lessonCode;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.lessonTitle;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.lessonName;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.lessonIcon;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.lessonTime;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.lessonTarget;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.mIntervalLessons;
        L23:
            float r10 = r6;
            List r11 = r7;
            int r12 = r4;
            int r13 = r5;
            String r14 = r3;
            int r15 = r1;
            return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
        public final VitalityDayLesson copy(int r10, @aa1 String r11, @aa1 String r12, int r13, int r14, float r15, @tb1 List<VitalityLessonIntervalLessons> r16) {
            Intrinsics.X0O(r11, "lessonTitle");
            Intrinsics.X0O(r12, "lessonName");
            return new VitalityDayLesson(r10, r11, r12, r13, r14, r15, r16);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof VitalityDayLesson) == true) goto L8;
            return false;
        L8:
            VitalityDayLesson r6 = (VitalityDayLesson) r5;
            if (this.lessonCode == r6.lessonCode) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.lessonTitle, r6.lessonTitle) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.lessonName, r6.lessonName) == true) goto L18;
            return false;
        L18:
            if (this.lessonIcon == r6.lessonIcon) goto L21;
            return false;
        L21:
            if (this.lessonTime == r6.lessonTime) goto L24;
            return false;
        L24:
            if (Float.compare(this.lessonTarget, r6.lessonTarget) == 0) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.mIntervalLessons, r6.mIntervalLessons) == true) goto L29;
            return false;
        L29:
            return true;
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
            int r0 = ((((((((((Integer.hashCode(this.lessonCode) * 31) + this.lessonTitle.hashCode()) * 31) + this.lessonName.hashCode()) * 31) + Integer.hashCode(this.lessonIcon)) * 31) + Integer.hashCode(this.lessonTime)) * 31) + Float.hashCode(this.lessonTarget)) * 31;
            List<VitalityLessonIntervalLessons> r1 = this.mIntervalLessons;
            if (r1 != null) goto L5;
            int r2 = 0;
        L7:
            return r0 + r2;
        L5:
            r2 = r1.hashCode();
            goto L7
        }

        public final void setLessonTarget(float r1) {
            this.lessonTarget = r1;
        }

        @aa1
        public String toString() {
            return "VitalityDayLesson(lessonCode=" + this.lessonCode + ", lessonTitle=" + this.lessonTitle + ", lessonName=" + this.lessonName + ", lessonIcon=" + this.lessonIcon + ", lessonTime=" + this.lessonTime + ", lessonTarget=" + this.lessonTarget + ", mIntervalLessons=" + this.mIntervalLessons + I000IiI1O.iO.iO;
        }

        public VitalityDayLesson(int r2, @aa1 String r3, @aa1 String r4, int r5, int r6, float r7, @tb1 List<VitalityLessonIntervalLessons> r8) {
            Intrinsics.X0O(r3, "lessonTitle");
            Intrinsics.X0O(r4, "lessonName");
            this.lessonCode = r2;
            this.lessonTitle = r3;
            this.lessonName = r4;
            this.lessonIcon = r5;
            this.lessonTime = r6;
            this.lessonTarget = r7;
            this.mIntervalLessons = r8;
        }

        public /* synthetic */ VitalityDayLesson(int r2, String r3, String r4, int r5, int r6, float r7, List r8, int r9, DefaultConstructorMarker r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = 1;
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r9 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r9 & 8) == 0) goto L15;
            r5 = 0;
        L15:
            if ((r9 & 16) == 0) goto L18;
            r6 = 0;
        L18:
            if ((r9 & 32) == 0) goto L21;
            r7 = 95.0f;
        L21:
            if ((r9 & 64) == 0) goto L23;
            r8 = null;
        L23:
            float r11 = r7;
            List r12 = r8;
            int r13 = r6;
            String r14 = r4;
            int r15 = r2;
            this(r15, r3, r14, r5, r13, r11, r12);
        }
    }

    public static final class VitalityLesson extends JsonFieldContainer implements Serializable {

        @aa1
        private final String day;

        @aa1
        private List<VitalityDayLesson> dayLesson;
        private final int isCompletion;

        public VitalityLesson(@aa1 String r2, int r3, @aa1 List<VitalityDayLesson> r4) {
            Intrinsics.X0O(r2, "day");
            Intrinsics.X0O(r4, "dayLesson");
            this.day = r2;
            this.isCompletion = r3;
            this.dayLesson = r4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VitalityLesson copy$default(VitalityLesson r0, String r1, int r2, List r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.day;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.isCompletion;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.dayLesson;
        L12:
            return r0.copy(r1, r2, r3);
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
        public final VitalityLesson copy(@aa1 String r2, int r3, @aa1 List<VitalityDayLesson> r4) {
            Intrinsics.X0O(r2, "day");
            Intrinsics.X0O(r4, "dayLesson");
            return new VitalityLesson(r2, r3, r4);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof VitalityLesson) == true) goto L8;
            return false;
        L8:
            VitalityLesson r6 = (VitalityLesson) r5;
            if (Intrinsics.XOO0ii0(this.day, r6.day) == true) goto L12;
            return false;
        L12:
            if (this.isCompletion == r6.isCompletion) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.dayLesson, r6.dayLesson) == true) goto L17;
            return false;
        L17:
            return true;
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

        public final void setDayLesson(@aa1 List<VitalityDayLesson> r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.dayLesson = r2;
        }

        @aa1
        public String toString() {
            return "VitalityLesson(day=" + this.day + ", isCompletion=" + this.isCompletion + ", dayLesson=" + this.dayLesson + I000IiI1O.iO.iO;
        }

        public /* synthetic */ VitalityLesson(String r1, int r2, List r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = "0";
        L6:
            if ((r4 & 2) == 0) goto L8;
            r2 = 0;
        L8:
            this(r1, r2, r3);
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
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
            float r7 = 0.0f;
            this(r1, r2, r3, r4, r5, r6, r7, 127, null);
        }

        public static /* synthetic */ VitalityLessonIntervalLessons copy$default(VitalityLessonIntervalLessons r0, int r1, int r2, int r3, int r4, int r5, int r6, float r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.intenseMinutes;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.restMinutes;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.upperBoundHR;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.lowerBoundHR;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.restHR;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.repeatTimes;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.target;
        L23:
            int r10 = r6;
            float r11 = r7;
            int r12 = r4;
            int r13 = r5;
            int r14 = r3;
            int r15 = r1;
            return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
        public final VitalityLessonIntervalLessons copy(int r9, int r10, int r11, int r12, int r13, int r14, float r15) {
            return new VitalityLessonIntervalLessons(r9, r10, r11, r12, r13, r14, r15);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof VitalityLessonIntervalLessons) == true) goto L8;
            return false;
        L8:
            VitalityLessonIntervalLessons r6 = (VitalityLessonIntervalLessons) r5;
            if (this.intenseMinutes == r6.intenseMinutes) goto L12;
            return false;
        L12:
            if (this.restMinutes == r6.restMinutes) goto L15;
            return false;
        L15:
            if (this.upperBoundHR == r6.upperBoundHR) goto L18;
            return false;
        L18:
            if (this.lowerBoundHR == r6.lowerBoundHR) goto L21;
            return false;
        L21:
            if (this.restHR == r6.restHR) goto L24;
            return false;
        L24:
            if (this.repeatTimes == r6.repeatTimes) goto L27;
            return false;
        L27:
            if (Float.compare(this.target, r6.target) == 0) goto L29;
            return false;
        L29:
            return true;
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
            return "VitalityLessonIntervalLessons(intenseMinutes=" + this.intenseMinutes + ", restMinutes=" + this.restMinutes + ", upperBoundHR=" + this.upperBoundHR + ", lowerBoundHR=" + this.lowerBoundHR + ", restHR=" + this.restHR + ", repeatTimes=" + this.repeatTimes + ", target=" + this.target + I000IiI1O.iO.iO;
        }

        public VitalityLessonIntervalLessons(int r1, int r2, int r3, int r4, int r5, int r6, float r7) {
            this.intenseMinutes = r1;
            this.restMinutes = r2;
            this.upperBoundHR = r3;
            this.lowerBoundHR = r4;
            this.restHR = r5;
            this.repeatTimes = r6;
            this.target = r7;
        }

        public /* synthetic */ VitalityLessonIntervalLessons(int r2, int r3, int r4, int r5, int r6, int r7, float r8, int r9, DefaultConstructorMarker r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            if ((r9 & 4) == 0) goto L12;
            r4 = 136;
        L12:
            if ((r9 & 8) == 0) goto L15;
            r5 = 113;
        L15:
            if ((r9 & 16) == 0) goto L18;
            r6 = 104;
        L18:
            if ((r9 & 32) == 0) goto L21;
            r7 = 0;
        L21:
            if ((r9 & 64) == 0) goto L23;
            r8 = 75.0f;
        L23:
            float r11 = r8;
            int r12 = r7;
            int r13 = r6;
            int r14 = r5;
            int r15 = r4;
            this(r2, r3, r15, r14, r13, r12, r11);
        }
    }

    static {
        OXO1 r0 = new OXO1(null);
        IiI10X = r0;
        monitor-enter(r0);
        AICoachManage r1 = new AICoachManage();     // Catch: Throwable -> L8
        XOO0ii0 = r1;     // Catch: Throwable -> L8
        monitor-exit(r0);
        XOO0ii0 = r1;
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public AICoachManage() {
        this.OXO1 = "AICoachManage";
        float r3 = 0.0f;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        List r7 = null;
        int r8 = 0;
        long r9 = 0;
        int[] r11 = null;
        List r12 = null;
        List r13 = null;
        int r14 = 0;
        int r15 = 0;
        float r16 = 0.0f;
        int r17 = 0;
        BleAICoachBeforePlan r18 = null;
        int r19 = 0;
        this.XIi00iiXO = new VitalityData(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, 65535, null);
    }

    public static /* synthetic */ boolean I0IIOi(AICoachManage r0, long r1, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 28;
    L6:
        return r0.XOO0ii0(r1, r3);
    }

    public static final Unit IiI10X(AICoachManage r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.DELETE, 255, false, false, 24, null);
        a01.OXO1.IiI10X().remove(b01.O1i0 + '_' + VitalityData.class.getName(), false);
        r9.XIi00iiXO.setPlanTarget(0.0f);
        I01XX0.XIi00iiXO(I01XX0.XIO11I, null, 2, null);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit OXO1(AICoachManage r0, BleConnector r1) {
        return IiI10X(r0, r1);
    }

    public static /* synthetic */ void OiIIX101O(AICoachManage r1, int r2, int r3, float r4, float r5, int r6, int r7, float r8, float r9, String r10, String r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L6;
        r6 = -1;
    L6:
        if ((r12 & 32) == 0) goto L9;
        r7 = -1;
    L9:
        if ((r12 & 64) == 0) goto L12;
        r8 = -1.0f;
    L12:
        if ((r12 & 128) == 0) goto L15;
        r9 = -1.0f;
    L15:
        if ((r12 & 256) == 0) goto L22;
        BleAICoachBeforePlan r14 = r1.XIi00iiXO.getMBeforePlanInfo();
        if (r14 == null) goto L20;
        r10 = r14.getMCurrentChecksum();
        if (r10 != null) goto L22;
    L20:
        r10 = "-999";
    L22:
        if ((r12 & 512) == 0) goto L28;
        BleAICoachBeforePlan r15 = r1.XIi00iiXO.getMBeforePlanInfo();
        if (r15 == null) goto L27;
        r11 = r15.getMLastChecksum();
        if (r11 != null) goto L28;
    L27:
        r11 = "-999";
    L28:
        r1.XX0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public static final /* synthetic */ AICoachManage XIi00iiXO() {
        return XOO0ii0;
    }

    public static final /* synthetic */ void iO(AICoachManage r0) {
        XOO0ii0 = r0;
    }

    @tb1
    public final BleAICoachGeneratePlan I0iXXO() {
        return this.XO0O10;
    }

    public final int I1(@aa1 Calendar r2) {
        Intrinsics.X0O(r2, "calendar");
        switch(r2.get(7)) {
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L4;
        };
    L4:
        return 0;
    L5:
        return 6;
    L7:
        return 5;
    L9:
        return 4;
    L11:
        return 3;
    L13:
        return 2;
    L15:
        return 1;
    L17:
        return 0;
    }

    public final boolean I1XOi1() {
        return this.O00;
    }

    public final void IIX1OXO() {
        Calendar r1 = Calendar.getInstance();
        r1.setTimeInMillis(this.XIi00iiXO.getStartTime());
        int r2 = r1.get(7);
        int r3 = r2 - 1;
        ArrayList r11 = new ArrayList();
        ArrayList r4 = new ArrayList();
        int r6 = 0;
        if (this.XIi00iiXO.getMVitalityDayLesson() == null) goto L5;
        List<VitalityLesson> r5 = this.XIi00iiXO.getMVitalityDayLesson();
        Intrinsics.XXI(r5);
        List<VitalityLesson> r8 = this.XIi00iiXO.getMVitalityDayLesson();
        Intrinsics.XXI(r8);
        r4.addAll(r5.subList(r3, r8.size()));
        List<VitalityLesson> r7 = this.XIi00iiXO.getMVitalityDayLesson();
        Intrinsics.XXI(r7);
        r4.addAll(r7.subList(0, r3));
    L5:
        Iterator r9 = r4.iterator();
        int r10 = 0;
    L7:
        if (r9.hasNext() == false) goto L30;
        Object r12 = r9.next();
        int r13 = r10 + 1;
        if (r10 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        VitalityLesson r14 = (VitalityLesson) r12;
        BleAICoachDayPlanCourse r15 = new BleAICoachDayPlanCourse(0, null, 0, 0.0f, 15, null);
        if (r14.getDayLesson().size() < 5) goto L28;
        ArrayList r16 = new ArrayList();
        r15.setMCourseNumber(r14.getDayLesson().size());
        Iterator<T> r17 = r14.getDayLesson().iterator();
    L15:
        if (r17.hasNext() == false) goto L25;
        VitalityDayLesson r18 = (VitalityDayLesson) r17.next();
        BleAICoachCourse r19 = new BleAICoachCourse(0, 0.0f, 0, 0, 0, 0, 0, 0, 255, null);
        r19.setMCourseType(r18.getLessonCode());
        r19.setMCourseGoal(r18.getLessonTarget());
        r19.setMCourseTime(r18.getLessonTime());
        if (r18.getMIntervalLessons() == null) goto L23;
        if (r18.getMIntervalLessons().isEmpty() == true) goto L23;
        r19.setMCourseUpperBoundHR(r18.getMIntervalLessons().get(0).getUpperBoundHR());
        r19.setMCourseLowerBoundHR(r18.getMIntervalLessons().get(0).getLowerBoundHR());
        if (r18.getLessonCode() != 1) goto L23;
        r19.setMCourseTime(r18.getMIntervalLessons().get(0).getIntenseMinutes());
        r19.setMRestMinutes(r18.getMIntervalLessons().get(0).getRestMinutes());
        r19.setMCourseRestHR(r18.getMIntervalLessons().get(0).getRestHR());
        r19.setMRepeatTimes(r18.getMIntervalLessons().get(0).getRepeatTimes());
    L23:
        r16.add(r19);
        goto L15
    L25:
        if (r14.getDayLesson().size() != 5) goto L27;
        r16.add(new BleAICoachCourse(0, 0.0f, 0, 0, 0, 0, 0, 0, 255, null));
    L27:
        r15.setMCoursesItem(r16);
        r15.setMCourseIndex(0);
        r15.setMCourseGoal(r14.getDayLesson().get(0).getLessonTarget());
        r11.add(r15);
    L29:
        r10 = r13;
        goto L7
    L28:
        r11.add(r15);
        goto L29
    L30:
        ArrayList r20 = new ArrayList(32);
        int r21 = 0;
    L31:
        if (r21 >= 32) goto L33;
        r20.add(0);
        r21 = r21 + 1;
        goto L31
    L33:
        List<Integer> r22 = this.XIi00iiXO.getDailySchedule().subList(0, 7);
        int r23 = r2 + 27;
        int r24 = r3;
    L34:
        if (r24 >= r23) goto L36;
        r20.set(r24 - r3, r22.get(r24 % 7));
        r24 = r24 + 1;
        goto L34
    L36:
        ArrayList r25 = new ArrayList(32);
        int r26 = 0;
    L37:
        if (r26 >= 32) goto L39;
        r25.add(0);
        r26 = r26 + 1;
        goto L37
    L39:
        BleAICoachGeneratePlan r27 = this.XO0O10;
        List<Integer> r28 = r25;
        if (r27 == null) goto L42;
        Intrinsics.XXI(r27);
        r28 = r27.getMCompletionMark();
    L42:
        int r29 = this.XIi00iiXO.getMProgress();
        int r30 = this.XIi00iiXO.getMAllExerciseTime();
        float r31 = this.XIi00iiXO.getMAll_METS();
        int r32 = this.XIi00iiXO.getMAllCalorie();
        if (this.O00 == false) goto L62;
        BleAICoachGeneratePlan r33 = this.XO0O10;
        if (r33 == null) goto L62;
        if (r33 == null) goto L48;
        r29 = r33.getMProgress();
    L49:
        BleAICoachGeneratePlan r34 = this.XO0O10;
        if (r34 == null) goto L52;
        r30 = r34.getMAllExerciseTime();
    L53:
        BleAICoachGeneratePlan r35 = this.XO0O10;
        if (r35 == null) goto L56;
        r31 = r35.getMAll_METS();
    L57:
        BleAICoachGeneratePlan r36 = this.XO0O10;
        if (r36 == null) goto L60;
        r6 = r36.getMAllCalorie();
    L60:
        int r110 = r6;
    L63:
        BleAICoachGeneratePlan r111 = new BleAICoachGeneratePlan(r20, r28, this.XIi00iiXO.getStartTime(), this.XIi00iiXO.getPlanTarget(), this.XIi00iiXO.getLevel(), r11, r29, r30, r31, r110);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " sendObject item item = " + r111);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.UPDATE, r111, false, false, 24, null);
        return;
    L56:
        r31 = 0.0f;
        goto L57
    L52:
        r30 = 0;
        goto L53
    L48:
        r29 = 0;
    L62:
        r110 = r32;
        goto L63
    }

    public final String IO(Calendar r2) {
        switch(r2.get(7)) {
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday7_s);
    L7:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday6_s);
    L9:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday5_s);
    L11:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday4_s);
    L13:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday3_s);
    L15:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday2_s);
    L17:
        return UtilsKt.XXO(R.string.abh_plan_label_weekday1_s);
    }

    public final void O00() {
        X0IOiX1O.XIi00iiXO(false, new O0O0X0iOi(this), 1, null);
    }

    @aa1
    public final Pair<List<String>, List<String>> O10IXXX0X() {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(this.XIi00iiXO.getStartTime());
        ArrayList r1 = new ArrayList();
        ArrayList r2 = new ArrayList();
        SimpleDateFormat r3 = new SimpleDateFormat(O0X11OiO.OII, Locale.getDefault());
        AICoachManage r4 = XOO0ii0;
        Intrinsics.XXI(r0);
        int r5 = r4.I1(r0);
        ArrayList r6 = new ArrayList();
        r6.addAll(ArraysKt___ArraysKt.OOX0iOi00(this.XIi00iiXO.getDailyTargets()).subList(r5, this.XIi00iiXO.getDailyTargets().length));
        int r7 = 0;
        r6.addAll(ArraysKt___ArraysKt.OOX0iOi00(this.XIi00iiXO.getDailyTargets()).subList(0, r5));
    L4:
        if (r7 >= 7) goto L13;
        if (r7 == 0) goto L7;
        r0.add(6, 1);
    L7:
        r1.add(r3.format(r0.getTime()) + " (" + IO(r0) + I000IiI1O.iO.iO);
        if (((Number) r6.get(r7)).intValue() <= 0) goto L10;
        r2.add(r6.get(r7) + " " + UtilsKt.XXO(R.string.abh_mets_unit));
    L11:
        r7 = r7 + 1;
        goto L4
    L10:
        r2.add(String.valueOf(UtilsKt.XXO(R.string.abh_rest_day)));
        goto L11
    L13:
        return new Pair(r1, r2);
    }

    public final void OII(@tb1 BleAICoachGeneratePlan r1) {
        this.XO0O10 = r1;
    }

    public final void OIX0iXi(int r9) {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.AI_COACH_PLAN, BleKeyFlag.READ, r9, false, false, 24, null);
    }

    public final void OIi0() {
    }

    public final void OX(@tb1 List<PlanGroupTitle> r1) {
        this.iO = r1;
    }

    public final void X01IiOiIi() {
    }

    @aa1
    public final VitalityData X0O() {
        return this.XIi00iiXO;
    }

    public final void X1ii() {
        this.iO = new ArrayList();
        if (this.XIi00iiXO.getMCompletionMark().isEmpty() == false) goto L5;
    L6:
        BleAICoachGeneratePlan r1 = this.XO0O10;
        if (r1 == null) goto L9;
        VitalityData r2 = this.XIi00iiXO;
        Intrinsics.XXI(r1);
        r2.setMCompletionMark(r1.getMCompletionMark());
    L14:
        if (this.XIi00iiXO.getDailySchedule().size() < 6) goto L40;
        Calendar r3 = Calendar.getInstance();
        r3.setTimeInMillis(this.XIi00iiXO.getStartTime());
        SimpleDateFormat r4 = new SimpleDateFormat(DateFormatUtils.DD, Locale.getDefault());
        int r6 = r3.get(7) - 1;
        boolean r8 = false;
    L18:
        if (r6 <= 0) goto L24;
        if (r6 <= 0) goto L23;
        if (this.XIi00iiXO.getDailySchedule().get(r6 - 1).intValue() != 1) goto L23;
        r8 = true;
    L23:
        r3.add(6, -1);
        Intrinsics.XXI(r3);
        String r12 = IO(r3);
        List<PlanGroupTitle> r10 = this.iO;
        Intrinsics.XXI(r10);
        String r13 = r4.format(r3.getTime());
        Intrinsics.O10IXXX0X(r13, "format(...)");
        r10.add(0, new PlanGroupTitle(r12, r13, false, false, 0, null, 56, null));
        r6 = r6 - 1;
        goto L18
    L24:
        int r7 = ((Number) CollectionsKt___CollectionsKt.Xi1XO00(this.XIi00iiXO.getDailySchedule())).intValue();
        r3.setTimeInMillis(this.XIi00iiXO.getStartTime());
        if (r8 == false) goto L34;
        List<PlanGroupTitle> r9 = this.iO;
        Intrinsics.XXI(r9);
        int r11 = r9.size();
        int r14 = r11 + 28;
        int r15 = r11;
    L27:
        if (r15 >= r14) goto L31;
        if (r15 == r11) goto L30;
        r3.add(6, 1);
    L30:
        List<PlanGroupTitle> r16 = this.iO;
        Intrinsics.XXI(r16);
        Intrinsics.XXI(r3);
        String r17 = IO(r3);
        String r18 = r4.format(r3.getTime());
        Intrinsics.O10IXXX0X(r18, "format(...)");
        r16.add(new PlanGroupTitle(r17, r18, true, OiOX0i.XIi00iiXO(this.XIi00iiXO.getMCompletionMark().get(r15 - r11).intValue()), r15, null, 32, null));
        r15 = r15 + 1;
        goto L27
    L31:
        int r5 = 7 - r11;
        int r19 = 0;
    L32:
        if (r19 >= r5) goto L53;
        r3.add(6, 1);
        List<PlanGroupTitle> r20 = this.iO;
        Intrinsics.XXI(r20);
        Intrinsics.XXI(r3);
        String r110 = IO(r3);
        String r111 = r4.format(r3.getTime());
        Intrinsics.O10IXXX0X(r111, "format(...)");
        r20.add(new PlanGroupTitle(r110, r111, false, false, 0, null, 56, null));
        r19 = r19 + 1;
        goto L32
    L53:
        return;
    L34:
        List<PlanGroupTitle> r21 = this.iO;
        Intrinsics.XXI(r21);
        int r22 = r21.size();
        int r23 = r22;
    L36:
        if (r23 >= 28) goto L54;
        if (r23 == r22) goto L39;
        r3.add(6, 1);
    L39:
        List<PlanGroupTitle> r24 = this.iO;
        Intrinsics.XXI(r24);
        Intrinsics.XXI(r3);
        String r112 = IO(r3);
        String r113 = r4.format(r3.getTime());
        Intrinsics.O10IXXX0X(r113, "format(...)");
        r24.add(new PlanGroupTitle(r112, r113, true, OiOX0i.XIi00iiXO(this.XIi00iiXO.getMCompletionMark().get(r23 - r22).intValue()), (r23 + r7) - 1, null, 32, null));
        r23 = r23 + 1;
        goto L36
    L54:
        return;
    L40:
        return;
    L9:
        VitalityData r25 = this.XIi00iiXO;
        ArrayList r26 = new ArrayList(32);
        int r27 = 0;
    L10:
        if (r27 >= 32) goto L12;
        r26.add(0);
        r27 = r27 + 1;
        goto L10
    L12:
        r25.setMCompletionMark(r26);
        goto L14
    L5:
        if (this.XIi00iiXO.getMCompletionMark().size() >= 32) goto L14;
        goto L6
    }

    public final void XO0O10() {
    }

    public final boolean XOO0ii0(long r3, int r5) {
        long r0 = System.currentTimeMillis() - r3;
        if (r0 < (r5 * 86400000)) goto L5;
        return false;
    L5:
        if (r0 <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void XX0(int r1, int r2, float r3, float r4, int r5, int r6, float r7, float r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r9, "currentChecksum");
        Intrinsics.X0O(r10, "lastChecksum");
    }

    @tb1
    public final List<PlanGroupTitle> XXI() {
        return this.iO;
    }

    public final void XiOIO(@aa1 BleAICoachGeneratePlan r10) {
        Intrinsics.X0O(r10, "plan");
        this.XO0O10 = r10;
        this.XIi00iiXO.setMProgress(r10.getMProgress());
        this.XIi00iiXO.setMAllExerciseTime(r10.getMAllExerciseTime());
        this.XIi00iiXO.setMAll_METS(r10.getMAll_METS());
        this.XIi00iiXO.setMAllCalorie(r10.getMAllCalorie());
        this.XIi00iiXO.setMCompletionMark(r10.getMCompletionMark());
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.O1i0 + '_' + VitalityData.class.getName(), new Gson().toJson(this.XIi00iiXO), false);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setAICoachGeneratePlan = " + this.XO0O10);
        long r5 = (long) 1000;
        if ((r10.getMPlanStartTime() / r5) != (this.XIi00iiXO.getStartTime() / r5)) goto L13;
        if (this.XIi00iiXO.getStartTime() == 0) goto L13;
        long r3 = r0.IiI10X().getLong(b01.OXI0Xi, 0);
        if (r3 > 0) goto L9;
        return;
    L9:
        if (XOO0ii0(r3, 1) == false) goto L19;
        X01IiOiIi();
        this.O00 = true;
        IIX1OXO();
        return;
    L19:
        return;
    L13:
        if (this.XIi00iiXO.getStartTime() != 0) goto L15;
        return;
    L15:
        if (this.XIi00iiXO.getPlanTarget() <= 0.0f) goto L21;
        this.O00 = false;
        IIX1OXO();
        return;
    }

    public final void XiOIii1(boolean r1) {
        this.O00 = r1;
    }

    public final void iIiiO(@aa1 BleAICoachBeforePlan r2) {
        Intrinsics.X0O(r2, "info");
        this.XIi00iiXO.setMBeforePlanInfo(r2);
    }

    public final void iOOX010X(@aa1 VitalityData r2) {
        Intrinsics.X0O(r2, "data");
        this.XIi00iiXO = r2;
    }
}
