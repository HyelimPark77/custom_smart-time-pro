.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1;->OXO1(Lcom/sma/smartv3/model/DeviceConfigInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/lang/String;

.field public final synthetic IO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;->IO:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;->I1:Ljava/lang/String;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/request/transition/Transition<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v0, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;->IO:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;->I1:Ljava/lang/String;

    invoke-static {p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->Ii0i(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, p2, v0}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    const/4 p1, 0x0

    const/4 p2, 0x2

    const-string v0, "pair_image_change_attachment"

    invoke-static {v0, p1, p2, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$OXO1;->OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
