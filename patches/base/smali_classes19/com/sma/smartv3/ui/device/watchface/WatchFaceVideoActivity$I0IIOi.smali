.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMBackgroundImageIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMCustomWatchFace$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Lcom/android/mltcode/paycertificationapi/X1XX1O;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "mCustomWatchFace"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->I00(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMBackgroundImageIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$setMBackgroundImageIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMHandler$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$I0IIOi;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMPlayInterval$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
