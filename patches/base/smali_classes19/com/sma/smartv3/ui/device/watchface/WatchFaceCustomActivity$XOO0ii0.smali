.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1Ii1i11X$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final OXO1:Landroid/net/Uri;

.field public final XIi00iiXO:Landroid/net/Uri;

.field public final synthetic iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)V
    .locals 1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->II1Xi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->OXO1:Landroid/net/Uri;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "fromFile(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->XIi00iiXO:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public OXO1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->OXO1:Landroid/net/Uri;

    return-object v0
.end method

.method public XIi00iiXO(Landroid/net/Uri;)V
    .locals 4

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCropped => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMSelectAvatarPopup$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/android/mltcode/paycertificationapi/xz3;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->i11I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11I()Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".png"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v1, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$toRound(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->iO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->showRvBg$default(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public getResult()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XOO0ii0;->XIi00iiXO:Landroid/net/Uri;

    return-object v0
.end method
