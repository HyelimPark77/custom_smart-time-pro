.class public final Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initRecyclerView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/VipBenefit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/VipBenefit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;

    const p1, 0x7f0d0eea

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;Lcom/sma/smartv3/model/VipBenefit;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;Lcom/sma/smartv3/model/VipBenefit;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;Lcom/sma/smartv3/model/VipBenefit;Landroid/view/View;)V
    .locals 0

    iget-object p1, p1, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string p3, "mContext"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/VipBenefit;->getType()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->toVipBenefitIntent(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/VipBenefit;I)V
    .locals 2

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/VipBenefit;->getTitle()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0581

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a057f

    .line 3
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/VipBenefit;->getIvIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 5
    iget-object p3, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y30;

    invoke-direct {v0, p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/y30;-><init>(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;Lcom/sma/smartv3/model/VipBenefit;)V

    const p2, 0x7f0a0580

    invoke-virtual {p1, p2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/VipBenefit;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/VipBenefit;I)V

    return-void
.end method
