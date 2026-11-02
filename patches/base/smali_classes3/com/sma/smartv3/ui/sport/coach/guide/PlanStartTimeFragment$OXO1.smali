.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDateSelected(Ljava/util/Calendar;III)V
    .locals 0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->getMCalendarTitle()Landroid/widget/TextView;

    move-result-object p2

    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string p4, "MMMM yyyy"

    invoke-static {p3, p1, p4}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->access$formatCalendar(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p3

    invoke-static {p2, p3, p4}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->access$setStartTimeLong$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    sget-object p3, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I1(Ljava/util/Calendar;)I

    move-result p1

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;->access$setStartTimeOfWeek$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;I)V

    return-void
.end method

.method public onInteractivePrompts(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onMonthChange(Ljava/util/Calendar;III)V
    .locals 0

    return-void
.end method
