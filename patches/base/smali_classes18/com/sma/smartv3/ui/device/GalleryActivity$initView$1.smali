.class public final Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/GalleryActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/GalleryActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/GalleryActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/GalleryActivity;

    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "container"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "object"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/GalleryActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/GalleryActivity;->access$getMUris$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/GalleryActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/GalleryActivity;->access$getMContext(Lcom/sma/smartv3/ui/device/GalleryActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/device/GalleryActivity;

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v2

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/GalleryActivity;->access$getMUris$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/Uri;

    invoke-virtual {v2, p2}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/GalleryActivity;->access$getMWidth$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/GalleryActivity;->access$getMHeight$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p2, v2, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->override(II)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/RequestBuilder;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "object"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
