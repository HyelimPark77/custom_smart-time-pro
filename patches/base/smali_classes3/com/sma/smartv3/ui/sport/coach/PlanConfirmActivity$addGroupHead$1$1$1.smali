.class public final Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addGroupHead()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/util/List<",
        "+",
        "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic $viewPager:Landroidx/viewpager2/widget/ViewPager2;

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;>;",
            "Landroidx/viewpager2/widget/ViewPager2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;

    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    const p3, 0x7f0d0185

    invoke-direct {p0, p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;I)V"
        }
    .end annotation

    const-string p3, "itemHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "time"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {p3, p1, p2, v0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->access$addRecyclerView(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V

    return-void
.end method
