.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# instance fields
.field private final mCalendar:Ljava/util/Calendar;

.field private final mCalendarTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalendarView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTodayTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private startTimeLong:J

.field private startTimeOfWeek:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hx1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hx1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarView$delegate:Lkotlin/Lazy;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jx1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jx1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mTodayTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kx1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kx1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarTitle$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Lcom/sma/smartv3/view/ChooseStartCalendarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Lcom/sma/smartv3/view/ChooseStartCalendarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mTodayTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$formatCalendar(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setStartTimeLong$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeLong:J

    return-void
.end method

.method public static final synthetic access$setStartTimeOfWeek$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeOfWeek:I

    return-void
.end method

.method private final formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final mCalendarTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01fd

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mCalendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Lcom/sma/smartv3/view/ChooseStartCalendarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01fc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;

    return-object p0
.end method

.method private static final mTodayTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bc1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getMCalendar()Ljava/util/Calendar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    return-object v0
.end method

.method public final getMCalendarTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMCalendarView()Lcom/sma/smartv3/view/ChooseStartCalendarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendarView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;

    return-object v0
.end method

.method public final getMTodayTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mTodayTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarView()Lcom/sma/smartv3/view/ChooseStartCalendarView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setOnDateSelectedListener(Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarView()Lcom/sma/smartv3/view/ChooseStartCalendarView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setMax(Ljava/util/Calendar;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMTodayTime()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1410ed

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    const-string v3, "mCalendar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "dd/MM"

    invoke-direct {p0, v2, v4}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarView()Lcom/sma/smartv3/view/ChooseStartCalendarView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setMin(Ljava/util/Calendar;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarView()Lcom/sma/smartv3/view/ChooseStartCalendarView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Calendar;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "MMMM yyyy"

    invoke-direct {p0, v1, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeLong:J

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->mCalendar:Ljava/util/Calendar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I1(Ljava/util/Calendar;)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeOfWeek:I

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0179

    return v0
.end method

.method public onSlideDeselected()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget v2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeOfWeek:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    iget-wide v2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->startTimeLong:J

    invoke-virtual {v0, v2, v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setStartTime(J)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OIi0()V

    return-void
.end method

.method public onSlideSelected()V
    .locals 0

    return-void
.end method
