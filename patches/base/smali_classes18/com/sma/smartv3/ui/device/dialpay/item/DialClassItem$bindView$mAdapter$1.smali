.class public final Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;

    const p1, 0x7f0d0ee8

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->access$onAdapterClick(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;I)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/OnlineWatchFaceV2;I)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0a0581

    invoke-virtual {p1, v1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const v0, 0x7f0a057f

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 4
    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeCssClass()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 5
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX11XX1O;

    invoke-direct {v0, p2, p3}, Lcom/android/mltcode/paycertificationapi/iX11XX1O;-><init>(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;I)V

    const p2, 0x7f0a0580

    invoke-virtual {p1, p2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/OnlineWatchFaceV2;I)V

    return-void
.end method
