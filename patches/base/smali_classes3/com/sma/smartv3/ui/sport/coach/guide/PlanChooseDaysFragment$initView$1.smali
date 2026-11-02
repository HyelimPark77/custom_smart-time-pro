.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $mChoices:[Ljava/lang/String;

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;


# direct methods
.method public constructor <init>([Ljava/lang/String;Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->$mChoices:[Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    const p1, 0x7f0d0f02

    invoke-direct {p0, p3, p1, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;ILcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->convert$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;ILcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;ILcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->access$getMChooseActivity$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)[Z

    move-result-object p3

    aget-boolean p3, p3, p1

    const v0, 0x7f0a023d

    if-eqz p3, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->access$getMChooseActivity$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)[Z

    move-result-object p3

    const/4 v1, 0x0

    aput-boolean v1, p3, p1

    invoke-virtual {p2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->access$getMChooseActivity$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)[Z

    move-result-object p3

    const/4 v1, 0x1

    aput-boolean v1, p3, p1

    invoke-virtual {p2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getChoicesSize()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "PLAN_CHOOSE_DAY"

    invoke-static {p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a05c0

    .line 2
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    if-nez p3, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f0a18b0

    .line 3
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->$mChoices:[Ljava/lang/String;

    aget-object v0, v0, p3

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f0a023d

    .line 4
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->access$getMChooseActivity$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)[Z

    move-result-object v0

    aget-boolean v0, v0, p3

    invoke-virtual {p2, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 5
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iw1;

    invoke-direct {v1, v0, p3, p1}, Lcom/android/mltcode/paycertificationapi/iw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;ILcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;->$mChoices:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method
