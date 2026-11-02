.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->showPicsSparkChain(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $urls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/sma/smartv3/ui/device/dial/AIGCFragment;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->$urls:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    const p2, 0x7f0d0ebc

    invoke-direct {p0, p3, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/graphics/Bitmap;I)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->$urls:Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    check-cast p1, Landroid/widget/ImageView;

    .line 3
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v2

    .line 5
    invoke-virtual {v2, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Landroid/graphics/Bitmap;)Lcom/bumptech/glide/RequestBuilder;

    .line 6
    new-instance p2, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;

    invoke-direct {p2, p1, p3, v0, v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;-><init>(Landroid/widget/ImageView;ILjava/util/List;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    invoke-virtual {v2, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/graphics/Bitmap;I)V

    return-void
.end method
