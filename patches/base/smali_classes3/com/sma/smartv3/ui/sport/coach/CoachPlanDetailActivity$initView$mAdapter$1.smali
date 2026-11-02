.class public final Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;",
            "Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    const p2, 0x7f0d0ecc

    invoke-direct {p0, p3, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "viewHolder"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->access$getMVitalityDayLesson$p(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    move-result-object v2

    const/4 v4, 0x0

    const-string v5, "mVitalityDayLesson"

    if-nez v2, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTime()I

    move-result v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ":00"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f0a057c

    invoke-virtual {v1, v7, v6}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 3
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getLowerBoundHR()I

    move-result v6

    const-string v8, "--"

    const-string v9, " "

    const-string v10, " - "

    const v11, 0x7f140248

    const/4 v12, -0x1

    const v13, 0x7f0a0579

    if-eq v6, v12, :cond_2

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getUpperBoundHR()I

    move-result v6

    if-ne v6, v12, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getLowerBoundHR()I

    move-result v6

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getUpperBoundHR()I

    move-result v12

    iget-object v14, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-virtual {v14, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v13, v6}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    invoke-virtual {v1, v13, v8}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 6
    :goto_1
    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-static {v6}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->access$getMVitalityDayLesson$p(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v4

    :cond_3
    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonName()Ljava/lang/String;

    move-result-object v6

    const v12, 0x7f0a057d

    invoke-virtual {v1, v12, v6}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 7
    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-static {v6}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;->access$getMVitalityDayLesson$p(Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    move-result-object v6

    if-nez v6, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v4, v6

    :goto_2
    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonCode()I

    move-result v4

    const v5, 0x7f0a057a

    const v6, 0x7f1415f0

    if-eqz v4, :cond_7

    const/4 v14, 0x1

    if-eq v4, v14, :cond_5

    return-void

    .line 8
    :cond_5
    rem-int/lit8 v4, p3, 0x2

    if-nez v4, :cond_6

    .line 9
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getIntenseMinutes()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 10
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v12, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 11
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getLowerBoundHR()I

    move-result v2

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getUpperBoundHR()I

    move-result v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-virtual {v4, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v13, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void

    .line 12
    :cond_6
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->getRestMinutes()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 13
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    const v3, 0x7f14119d

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v12, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 14
    invoke-virtual {v1, v13, v8}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const v2, 0x7f0815b0

    .line 15
    invoke-virtual {v1, v5, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void

    .line 16
    :cond_7
    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v12, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const v2, 0x7f0815af

    .line 17
    invoke-virtual {v1, v5, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity$initView$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;I)V

    return-void
.end method
