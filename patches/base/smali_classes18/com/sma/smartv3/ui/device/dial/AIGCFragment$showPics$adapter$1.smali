.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->showPics([Ljava/lang/String;Ljava/lang/String;)V
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
.field final synthetic $imageSign:Ljava/lang/String;

.field final synthetic $urls:[Ljava/lang/String;

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/ui/device/dial/AIGCFragment;",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->$imageSign:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->$urls:[Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    const p1, 0x7f0d0ebc

    invoke-direct {p0, p4, p1, p5}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 7
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->$imageSign:Ljava/lang/String;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->$urls:[Ljava/lang/String;

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    move-object v2, p1

    check-cast v2, Landroid/widget/ImageView;

    .line 3
    invoke-static {v2}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    goto :goto_1

    .line 7
    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bearer "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    :goto_0
    new-instance v1, Lcom/bumptech/glide/load/model/GlideUrl;

    .line 9
    new-instance v3, Lcom/bumptech/glide/load/model/LazyHeaders$Builder;

    invoke-direct {v3}, Lcom/bumptech/glide/load/model/LazyHeaders$Builder;-><init>()V

    .line 10
    const-string v4, "Authorization"

    .line 11
    invoke-virtual {v3, v4, v0}, Lcom/bumptech/glide/load/model/LazyHeaders$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/bumptech/glide/load/model/LazyHeaders$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/bumptech/glide/load/model/LazyHeaders$Builder;->build()Lcom/bumptech/glide/load/model/LazyHeaders;

    move-result-object v0

    .line 13
    invoke-direct {v1, p2, v0}, Lcom/bumptech/glide/load/model/GlideUrl;-><init>(Ljava/lang/String;Lcom/bumptech/glide/load/model/Headers;)V

    .line 14
    invoke-virtual {p1, v1}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    .line 15
    :goto_1
    new-instance v1, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;-><init>(Landroid/widget/ImageView;Ljava/lang/String;I[Ljava/lang/String;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    invoke-virtual {p1, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method
