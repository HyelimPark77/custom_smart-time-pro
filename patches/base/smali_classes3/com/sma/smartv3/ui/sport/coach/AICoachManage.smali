.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;,
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;,
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;,
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;,
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;,
        Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,710:1\n1878#2,2:711\n1869#2,2:713\n1880#2:715\n1#3:716\n85#4,3:717\n97#4,3:720\n*S KotlinDebug\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n*L\n176#1:711,2\n181#1:713,2\n176#1:715\n667#1:717,3\n150#1:720,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,710:1\n1878#2,2:711\n1869#2,2:713\n1880#2:715\n1#3:716\n85#4,3:717\n97#4,3:720\n*S KotlinDebug\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage\n*L\n176#1:711,2\n181#1:713,2\n176#1:715\n667#1:717,3\n150#1:720,3\n*E\n"
    }
.end annotation


# static fields
.field public static final I0IIOi:I = 0x0

.field public static final I0iXXO:I = 0x4

.field public static final IO:I = 0x2

.field public static final IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OIX0iXi:I = 0x3

.field public static final OIi0:I = 0x1

.field public static volatile XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXI:I = 0x5


# instance fields
.field public O00:Z

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iO:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;-><init>()V

    sput-object v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sput-object v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public constructor <init>()V
    .locals 22

    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "AICoachManage"

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OXO1:Ljava/lang/String;

    new-instance v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    const v20, 0xffff

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v2 .. v21}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;-><init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;JIILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/16 p3, 0x1c

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0(JI)Z

    move-result p0

    return p0
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->AI_COACH_PLAN:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/16 v4, 0xff

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AI_COACH_PLAN_MOBILE_PHONE_V2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setPlanTarget(F)V

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string v0, "CREATE_AI_COACH_PLAN"

    invoke-static {v0, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;IIFFIIFFLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p12, p11, 0x10

    const/4 v0, -0x1

    if-eqz p12, :cond_0

    move p5, v0

    :cond_0
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_1

    move p6, v0

    :cond_1
    and-int/lit8 p12, p11, 0x40

    const/high16 v0, -0x40800000    # -1.0f

    if-eqz p12, :cond_2

    move p7, v0

    :cond_2
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_3

    move p8, v0

    :cond_3
    and-int/lit16 p12, p11, 0x100

    const-string v0, "-999"

    if-eqz p12, :cond_5

    iget-object p9, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMBeforePlanInfo()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-result-object p9

    if-eqz p9, :cond_4

    invoke-virtual {p9}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->getMCurrentChecksum()Ljava/lang/String;

    move-result-object p9

    if-nez p9, :cond_5

    :cond_4
    move-object p9, v0

    :cond_5
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_7

    iget-object p10, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p10}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMBeforePlanInfo()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-result-object p10

    if-eqz p10, :cond_6

    invoke-virtual {p10}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->getMLastChecksum()Ljava/lang/String;

    move-result-object p10

    if-nez p10, :cond_7

    :cond_6
    move-object p10, v0

    :cond_7
    invoke-virtual/range {p0 .. p10}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XX0(IIFFIIFFLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic XIi00iiXO()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    return-object v0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    return-void
.end method


# virtual methods
.method public final I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    return-object v0
.end method

.method public final I1(Ljava/util/Calendar;)I
    .locals 1
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    return v0

    :pswitch_0
    const/4 p1, 0x6

    return p1

    :pswitch_1
    const/4 p1, 0x5

    return p1

    :pswitch_2
    const/4 p1, 0x4

    return p1

    :pswitch_3
    const/4 p1, 0x3

    return p1

    :pswitch_4
    const/4 p1, 0x2

    return p1

    :pswitch_5
    const/4 p1, 0x1

    return p1

    :pswitch_6
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I1XOi1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00:Z

    return v0
.end method

.method public final IIX1OXO()V
    .locals 28

    move-object/from16 v0, p0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v3, v1, -0x1

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v5, :cond_0

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v8, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-interface {v5, v3, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v5, v6, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v6

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v5, 0x1

    if-gez v5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v8, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    new-instance v12, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;-><init>(ILjava/util/List;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v10, 0x5

    if-lt v5, v10, :cond_5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseNumber(I)V

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    new-instance v15, Lcom/szabh/smable3/entity/BleAICoachCourse;

    const/16 v24, 0xff

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v25}, Lcom/szabh/smable3/entity/BleAICoachCourse;-><init>(IFIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonCode()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseType(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTarget()F

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseGoal(F)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTime()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseTime(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getUpperBoundHR()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseUpperBoundHR(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getLowerBoundHR()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseLowerBoundHR(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonCode()I

    move-result v2

    const/4 v10, 0x1

    if-ne v2, v10, :cond_2

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getIntenseMinutes()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseTime(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getRestMinutes()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMRestMinutes(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getRestHR()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMCourseRestHR(I)V

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getRepeatTimes()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/szabh/smable3/entity/BleAICoachCourse;->setMRepeatTimes(I)V

    :cond_2
    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x7

    const/4 v10, 0x5

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v10, 0x5

    if-ne v2, v10, :cond_4

    new-instance v17, Lcom/szabh/smable3/entity/BleAICoachCourse;

    const/16 v26, 0xff

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v17 .. v27}, Lcom/szabh/smable3/entity/BleAICoachCourse;-><init>(IFIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v17

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v12, v5}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCoursesItem(Ljava/util/List;)V

    invoke-virtual {v12, v6}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseIndex(I)V

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTarget()F

    move-result v2

    invoke-virtual {v12, v2}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseGoal(F)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v5, v9

    const/4 v2, 0x7

    goto/16 :goto_0

    :cond_6
    new-instance v5, Ljava/util/ArrayList;

    const/16 v2, 0x20

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v6

    :goto_3
    if-ge v4, v2, :cond_7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v4

    const/4 v8, 0x7

    invoke-interface {v4, v6, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    add-int/lit8 v1, v1, 0x1b

    move v8, v3

    :goto_4
    if-ge v8, v1, :cond_8

    sub-int v9, v8, v3

    rem-int/lit8 v10, v8, 0x7

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v5, v9, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v3, v6

    :goto_5
    if-ge v3, v2, :cond_9

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_9
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v2, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMCompletionMark()Ljava/util/List;

    move-result-object v1

    :cond_a
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMProgress()I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAllExerciseTime()I

    move-result v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAll_METS()F

    move-result v4

    iget-object v7, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAllCalorie()I

    move-result v7

    iget-boolean v8, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00:Z

    if-eqz v8, :cond_f

    iget-object v8, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v8, :cond_f

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMProgress()I

    move-result v2

    goto :goto_6

    :cond_b
    move v2, v6

    :goto_6
    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllExerciseTime()I

    move-result v3

    goto :goto_7

    :cond_c
    move v3, v6

    :goto_7
    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAll_METS()F

    move-result v4

    goto :goto_8

    :cond_d
    const/4 v4, 0x0

    :goto_8
    iget-object v7, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllCalorie()I

    move-result v6

    :cond_e
    move v15, v6

    :goto_9
    move v12, v2

    move v13, v3

    move v14, v4

    goto :goto_a

    :cond_f
    move v15, v7

    goto :goto_9

    :goto_a
    new-instance v19, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v7

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getPlanTarget()F

    move-result v9

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getLevel()I

    move-result v10

    move-object v6, v1

    move-object/from16 v4, v19

    invoke-direct/range {v4 .. v15}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;-><init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OXO1:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " sendObject item item = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v16, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v17, Lcom/szabh/smable3/BleKey;->AI_COACH_PLAN:Lcom/szabh/smable3/BleKey;

    sget-object v18, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v22, 0x18

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final IO(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    const p1, 0x7f14004a

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const p1, 0x7f140049

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p1, 0x7f140048

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    const p1, 0x7f140047

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    const p1, 0x7f140046

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    const p1, 0x7f140045

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_5
    const p1, 0x7f140044

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final O00()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0O0X0iOi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0O0X0iOi;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method public final O10IXXX0X()Lkotlin/Pair;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "dd/MM"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sget-object v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0:Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I1(Ljava/util/Calendar;)I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailyTargets()[I

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/ArraysKt___ArraysKt;->OOX0iOi00([I)Ljava/util/List;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailyTargets()[I

    move-result-object v7

    array-length v7, v7

    invoke-interface {v6, v4, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailyTargets()[I

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/ArraysKt___ArraysKt;->OOX0iOi00([I)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v6, v7, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_0
    const/4 v4, 0x7

    if-ge v7, v4, :cond_2

    if-eqz v7, :cond_0

    const/4 v4, 0x6

    const/4 v6, 0x1

    invoke-virtual {v0, v4, v6}, Ljava/util/Calendar;->add(II)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IO(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-lez v4, :cond_1

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const v6, 0x7f140033

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const v4, 0x7f14004d

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final OII(Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    return-void
.end method

.method public final OIX0iXi(I)V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->AI_COACH_PLAN:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, p1

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void
.end method

.method public final OIi0()V
    .locals 0

    return-void
.end method

.method public final OX(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    return-void
.end method

.method public final X01IiOiIi()V
    .locals 0

    return-void
.end method

.method public final X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    return-object v0
.end method

.method public final X1ii()V
    .locals 20

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMCompletionMark()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v2, 0x20

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMCompletionMark()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v2, :cond_3

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    if-eqz v1, :cond_1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMCompletionMark()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMCompletionMark(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v3

    :goto_0
    if-ge v5, v2, :cond_2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMCompletionMark(Ljava/util/List;)V

    :cond_3
    :goto_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x6

    if-ge v1, v2, :cond_4

    goto/16 :goto_6

    :cond_4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const/4 v5, 0x7

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    move v8, v3

    :goto_2
    const-string v9, "format(...)"

    if-lez v6, :cond_6

    if-lez v6, :cond_5

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v10}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v10

    add-int/lit8 v11, v6, -0x1

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_5

    move v8, v7

    :cond_5
    const/4 v10, -0x1

    invoke-virtual {v1, v2, v10}, Ljava/util/Calendar;->add(II)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IO(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v12

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v11, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v18, 0x38

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v10, v3, v11}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    :cond_6
    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v10}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v10

    invoke-virtual {v1, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    if-eqz v8, :cond_9

    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v8, v6, 0x1c

    move v15, v6

    :goto_3
    if-ge v15, v8, :cond_8

    if-eq v15, v6, :cond_7

    invoke-virtual {v1, v2, v7}, Ljava/util/Calendar;->add(II)V

    :cond_7
    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v11, v10

    new-instance v10, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v12, v11

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IO(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMCompletionMark()Ljava/util/List;

    move-result-object v14

    sub-int v3, v15, v6

    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v14

    const/16 v17, 0x20

    const/16 v18, 0x0

    move-object v3, v12

    move-object v12, v13

    const/4 v13, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x0

    goto :goto_3

    :cond_8
    sub-int/2addr v5, v6

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v5, :cond_b

    invoke-virtual {v1, v2, v7}, Ljava/util/Calendar;->add(II)V

    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v10, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IO(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x38

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    move v5, v3

    :goto_5
    const/16 v8, 0x1c

    if-ge v5, v8, :cond_b

    if-eq v5, v3, :cond_a

    invoke-virtual {v1, v2, v7}, Ljava/util/Calendar;->add(II)V

    :cond_a
    iget-object v8, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v10, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IO(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v13}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMCompletionMark()Ljava/util/List;

    move-result-object v13

    sub-int v14, v5, v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v14

    add-int v13, v5, v6

    add-int/lit8 v15, v13, -0x1

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/4 v13, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    return-void
.end method

.method public final XO0O10()V
    .locals 0

    return-void
.end method

.method public final XOO0ii0(JI)Z
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const p1, 0x5265c00

    mul-int/2addr p3, p1

    int-to-long p1, p3

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const-wide/16 p1, 0x0

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final XX0(IIFFIIFFLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p1, "currentChecksum"

    invoke-static {p9, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "lastChecksum"

    invoke-static {p10, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final XXI()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iO:Ljava/util/List;

    return-object v0
.end method

.method public final XiOIO(Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V
    .locals 9
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "plan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMProgress(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllExerciseTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMAllExerciseTime(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAll_METS()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMAll_METS(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllCalorie()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMAllCalorie(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMCompletionMark()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMCompletionMark(Ljava/util/List;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AI_COACH_PLAN_MOBILE_PHONE_V2"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OXO1:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10:Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " setAICoachGeneratePlan = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMPlanStartTime()J

    move-result-wide v1

    const/16 p1, 0x3e8

    int-to-long v5, p1

    div-long/2addr v1, v5

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v7

    div-long/2addr v7, v5

    cmp-long p1, v1, v7

    const-wide/16 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v5

    cmp-long p1, v5, v1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "AI_COACH_PLAN_MOBILE_PHONE"

    invoke-virtual {p1, v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, v3, v4, p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XOO0ii0(JI)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X01IiOiIi()V

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IIX1OXO()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v5

    cmp-long p1, v5, v1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getPlanTarget()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_1

    iput-boolean v4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final XiOIii1(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00:Z

    return-void
.end method

.method public final iIiiO(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setMBeforePlanInfo(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V

    return-void
.end method

.method public final iOOX010X(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    return-void
.end method
