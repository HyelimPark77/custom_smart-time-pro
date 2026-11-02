.class public final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setRecyclerView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/android/mltcode/paycertificationapi/d11;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/main/NationServerSelectActivity;",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    const v0, 0x7f0d0f53

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;->convert$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$upDataNationList(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/android/mltcode/paycertificationapi/d11;I)V
    .locals 1

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const p3, 0x7f0a0573

    .line 2
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/e11;->iO(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz p1, :cond_1

    const p3, 0x7f0a0238

    .line 3
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_3

    .line 4
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/d11;->IO()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    if-eqz p1, :cond_4

    .line 5
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    if-eqz p1, :cond_4

    iget-object p3, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y11;

    invoke-direct {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/y11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/android/mltcode/paycertificationapi/d11;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/android/mltcode/paycertificationapi/d11;I)V

    return-void
.end method
