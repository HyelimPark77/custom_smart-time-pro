.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    const p1, 0x7f0d0eda

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->isSync()Z

    move-result p2

    if-eqz p2, :cond_0

    const p0, 0x7f1412fe

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg0(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg1(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg3(Ljava/io/Serializable;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->watchFaceClick()V

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$initData(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
    .locals 9

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/view/SquareImageView;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p3, 0x7f0a08f9

    .line 5
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/sma/smartv3/view/ProgressButtonV2;

    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result v1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v2

    .line 7
    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollarDis()F

    move-result v3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmountDis()F

    move-result v4

    .line 8
    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result v5

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPayStatus()Ljava/lang/String;

    move-result-object v7

    .line 9
    invoke-static/range {v0 .. v7}, Lcom/android/mltcode/paycertificationapi/XXiO;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;FFFFZLjava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-static {p3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const v1, 0x7f1412fb

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 11
    invoke-static/range {v0 .. v8}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    .line 12
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xo6;

    invoke-direct {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/xo6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

    return-void
.end method
