.class public final Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoachPlanDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachPlanDetailActivity.kt\ncom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoachPlanDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachPlanDetailActivity.kt\ncom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final detailRecycler$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final detailValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOiX1I0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOiX1I0I;-><init>(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1O1I0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1O1I0X;-><init>(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0iIiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0iIiX;-><init>(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1O1iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1O1iX;-><init>(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailRecycler$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailRecycler_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0930

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getMVitalityDayLesson$p(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    return-object p0
.end method

.method private static final detailRecycler_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a092f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final detailValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0931

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getAbhTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getDetailRecycler()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailRecycler$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getDetailValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->detailValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.coach.AICoachManage.VitalityDayLesson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    return-void
.end method

.method public initView()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getAbhTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    const/4 v2, 0x0

    const-string v3, "mVitalityDayLesson"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getDetailValue()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTarget()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getDetailRecycler()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getDetailRecycler()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060760

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const/16 v5, 0x20

    const/4 v6, 0x1

    invoke-direct {v1, p0, v6, v4, v5}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonCode()I

    move-result v0

    if-ne v0, v6, :cond_a

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getTarget()F

    move-result v0

    const/high16 v4, -0x40800000    # -1.0f

    cmpg-float v0, v0, v4

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getDetailValue()Landroid/widget/TextView;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v4, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_7
    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getTarget()F

    move-result v4

    float-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v4, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_8
    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getRepeatTimes()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_c

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v6, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v2

    :cond_9
    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_a
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    if-nez v0, :cond_b

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_b
    move-object v2, v0

    :goto_2
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getMIntervalLessons()Ljava/util/List;

    move-result-object v0

    :cond_c
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;

    invoke-direct {v2, v0, p0, v1}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;Landroid/app/Activity;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->getDetailRecycler()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0047

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method
