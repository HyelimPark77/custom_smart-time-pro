.class public final Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;
.super Lcom/youth/banner/adapter/BannerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImageAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/youth/banner/adapter/BannerAdapter<",
        "Lcom/sma/smartv3/model/WatchFaceBanner;",
        "Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/youth/banner/adapter/BannerAdapter;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public onBindView(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;Lcom/sma/smartv3/model/WatchFaceBanner;II)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/WatchFaceBanner;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, p3

    :goto_0
    if-eqz p4, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object p4

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceBanner;->getSlidePath()Ljava/lang/String;

    move-result-object p3

    :cond_1
    invoke-virtual {p4, p3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    return-void
.end method

.method public bridge synthetic onBindView(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;

    check-cast p2, Lcom/sma/smartv3/model/WatchFaceBanner;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;->onBindView(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;Lcom/sma/smartv3/model/WatchFaceBanner;II)V

    return-void
.end method

.method public onCreateHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;

    invoke-direct {p1, p0, p2}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;-><init>(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;Landroid/widget/ImageView;)V

    return-object p1
.end method

.method public bridge synthetic onCreateHolder(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;->onCreateHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;

    move-result-object p1

    return-object p1
.end method
