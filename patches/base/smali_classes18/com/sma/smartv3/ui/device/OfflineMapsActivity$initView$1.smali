.class public final Lcom/sma/smartv3/ui/device/OfflineMapsActivity$initView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/MapFileItem;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/OfflineMapsActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/MapFileItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    const v0, 0x7f0d0efb

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$initView$1;->convert$lambda$0(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->access$showListPopup(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/MapFileItem;I)V
    .locals 2

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->getName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a08b5

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a08b4

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->getFileAllSize()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a08b6

    .line 4
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->isSync()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    const p3, 0x7f0a08b2

    .line 5
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 6
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->getImgPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 7
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pe1;

    invoke-direct {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/pe1;-><init>(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$initView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/MapFileItem;I)V

    return-void
.end method
