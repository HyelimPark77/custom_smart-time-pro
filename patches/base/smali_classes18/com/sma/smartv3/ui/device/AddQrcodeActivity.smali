.class public final Lcom/sma/smartv3/ui/device/AddQrcodeActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final REQUEST_ADD_QRCODE:I

.field private static final REQUEST_CODE:I


# instance fields
.field private mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

.field private mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->Companion:Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;

    const/4 v0, 0x1

    sput v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->REQUEST_CODE:I

    const/4 v0, 0x2

    sput v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->REQUEST_ADD_QRCODE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIX1O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIX1O1i;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->rootView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onSelect$lambda$0$1$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onSelect$lambda$0$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Landroid/content/Intent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onActivityResult$lambda$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Landroid/content/Intent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onActivityResult$lambda$0$1(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onSelect$lambda$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onSelect$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->onSelect$lambda$0$1(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getREQUEST_ADD_QRCODE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->REQUEST_ADD_QRCODE:I

    return v0
.end method

.method private final createQrcodeTypeInfo(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    const/4 v1, 0x0

    const-string v2, "mQrcodeTypeInfo"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "createQrcode -> mQrcodeTypeInfo="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/ta2;->IiI10X(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, [B

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x39

    if-le v5, v6, :cond_1

    const p1, 0x7f14035c

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f14114f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v5, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->setWidth(I)V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->setData([B)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->setDateTime(J)V

    new-instance v3, Ljava/io/File;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->Ii1iii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v5, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    :cond_3
    invoke-virtual {v5}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getDateTime()J

    move-result-wide v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ".jpg"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/16 v4, 0x200

    invoke-virtual {v0, p1, v4, v4, v3}, Lcom/android/mltcode/paycertificationapi/ta2;->iO(Ljava/lang/String;IILjava/io/File;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, v0

    :goto_0
    const-string v0, "qrcode"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_5
    return-void
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final onActivityResult$lambda$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Landroid/content/Intent;)Lkotlin/Unit;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iX1O1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    const-string v2, "qrtmp.jpg"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v1, p1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOii0;->O00(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/ta2;->OIi0(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncQrcode -> parseQrcodeResult:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez p1, :cond_1

    const p1, 0x7f141147

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto :goto_2

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->createQrcodeTypeInfo(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O0OXii1X1;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/O0OXii1X1;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onActivityResult$lambda$0$1(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onSelect$lambda$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;
    .locals 7

    const-string v0, "STORAGE"

    const-string v1, "CAMERA"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/Oiii1;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/Oiii1;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOI;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lcom/android/mltcode/paycertificationapi/ta2;->IO(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->createQrcodeTypeInfo(Ljava/lang/String;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$1(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Lkotlin/Unit;
    .locals 7

    const-string v0, "STORAGE"

    const-string v1, "CAMERA"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XOOOI0X;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/XOOOI0X;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$1$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    new-instance p1, Landroid/content/Intent;

    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "android.intent.action.PICK"

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "image/*"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    sget v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->REQUEST_CODE:I

    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.QrcodeTypeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez p1, :cond_0

    const-string p1, "mQrcodeTypeInfo"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mQrcodeTypeInfo -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    const/4 v2, 0x0

    const-string v3, "mQrcodeTypeInfo"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a1890    # 1.83561E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f141149

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00e9

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    sget p2, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->REQUEST_CODE:I

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    new-instance v5, Lcom/android/mltcode/paycertificationapi/OXiXO;

    invoke-direct {v5, p0, p3}, Lcom/android/mltcode/paycertificationapi/OXiXO;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;Landroid/content/Intent;)V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    :cond_1
    return-void
.end method

.method public final onSelect(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0I0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0I0X;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X01XO;-><init>(Lcom/sma/smartv3/ui/device/AddQrcodeActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
