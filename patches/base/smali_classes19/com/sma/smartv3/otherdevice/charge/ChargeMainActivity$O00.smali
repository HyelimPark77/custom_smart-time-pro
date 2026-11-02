.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1Ii1i11X$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final OXO1:Landroid/net/Uri;

.field public final XIi00iiXO:Landroid/net/Uri;

.field public final synthetic iO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->iO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->II1Xi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->OXO1:Landroid/net/Uri;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "fromFile(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->XIi00iiXO:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public OXO1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->OXO1:Landroid/net/Uri;

    return-object v0
.end method

.method public XIi00iiXO(Landroid/net/Uri;)V
    .locals 2

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

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->iO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getMSelectAvatarPopup$p(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Lcom/android/mltcode/paycertificationapi/xz3;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->iO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getMScreensaver$p(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Lcom/android/mltcode/paycertificationapi/IXO000;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/IXO000;->I0iXXO(Landroid/graphics/Bitmap;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->iO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$syncScreensaver(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V

    :cond_2
    return-void
.end method

.method public getResult()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$O00;->XIi00iiXO:Landroid/net/Uri;

    return-object v0
.end method
