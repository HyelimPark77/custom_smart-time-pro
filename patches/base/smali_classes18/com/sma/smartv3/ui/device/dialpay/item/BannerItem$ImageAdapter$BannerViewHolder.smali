.class public final Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "BannerViewHolder"
.end annotation


# instance fields
.field private imageView:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation

        .annotation build Lcom/android/mltcode/paycertificationapi/o91;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")V"
        }
    .end annotation

    const-string v0, "imageView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->this$0:Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->imageView:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final getImageView()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->imageView:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final setImageView(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter$BannerViewHolder;->imageView:Landroid/widget/ImageView;

    return-void
.end method
