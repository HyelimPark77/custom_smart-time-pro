.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->initView()V
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
.field final synthetic this$0:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    const v0, 0x1090003

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;->convert$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSelect_group_ll(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getTvSelect(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 2

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    const v0, 0x1020014

    .line 3
    invoke-virtual {p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 4
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX10OiI1;

    invoke-direct {v1, p3, p2}, Lcom/android/mltcode/paycertificationapi/XX10OiI1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSearchList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
