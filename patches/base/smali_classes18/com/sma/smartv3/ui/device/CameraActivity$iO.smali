.class public final Lcom/sma/smartv3/ui/device/CameraActivity$iO;
.super Lcom/google/android/cameraview/CameraView$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/CameraActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    invoke-direct {p0}, Lcom/google/android/cameraview/CameraView$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPictureTaken(Lcom/google/android/cameraview/CameraView;[B)V
    .locals 3

    const-string v0, "cameraView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const-string v1, "alpha"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    new-instance v0, Lcom/sma/smartv3/ui/device/CameraActivity$iO$OXO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    invoke-direct {v0, v1, p1, p2}, Lcom/sma/smartv3/ui/device/CameraActivity$iO$OXO1;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;Lcom/google/android/cameraview/CameraView;[B)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
