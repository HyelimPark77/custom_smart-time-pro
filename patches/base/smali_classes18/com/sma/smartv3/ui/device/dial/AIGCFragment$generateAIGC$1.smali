.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$generateAIGC$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->generateAIGC(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$generateAIGC$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Landroid/graphics/Bitmap;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$generateAIGC$1;->iO(Landroid/graphics/Bitmap;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    return-void
.end method

.method public static final iO(Landroid/graphics/Bitmap;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->showPicsSparkChain(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$generateAIGC$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIO11I;

    invoke-direct {v1, p1, v0}, Lcom/android/mltcode/paycertificationapi/XIO11I;-><init>(Landroid/graphics/Bitmap;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    invoke-static {v1}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$generateAIGC$1;->XIi00iiXO(Landroid/graphics/Bitmap;)V

    return-void
.end method
