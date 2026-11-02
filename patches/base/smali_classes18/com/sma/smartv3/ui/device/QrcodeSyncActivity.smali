.class public final Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final REQUEST_CODE:I

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

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
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->REQUEST_CODE:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/la2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/la2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onSelect$lambda$0$1(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onActivityResult$lambda$0$1(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onSelect$lambda$0$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onSelect$lambda$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onSelect$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onActivityResult$lambda$0$2(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onSelect$lambda$0$1$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Landroid/content/Intent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->onActivityResult$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Landroid/content/Intent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final onActivityResult$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Landroid/content/Intent;)Lkotlin/Unit;
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

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ma2;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/ma2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->syncQrcode(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/na2;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/na2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onActivityResult$lambda$0$1(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onActivityResult$lambda$0$2(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->showLoading()V

    return-void
.end method

.method private static final onSelect$lambda$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;
    .locals 7

    const-string v0, "STORAGE"

    const-string v1, "CAMERA"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/ia2;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/ia2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/oa2;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/oa2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ta2;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/ta2;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->showLoading()V

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->syncQrcode(Ljava/lang/String;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$1(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Lkotlin/Unit;
    .locals 7

    const-string v0, "STORAGE"

    const-string v1, "CAMERA"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/pa2;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/pa2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSelect$lambda$0$1$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
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

    iget v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->REQUEST_CODE:I

    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final showLoading()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private final syncQrcode(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    const/4 v1, 0x0

    const-string v2, "mQrcodeTypeInfo"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncQrcode -> mQrcodeTypeInfo="

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

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getQrcodeType()I

    move-result v3

    invoke-virtual {v0, p1, v3}, Lcom/android/mltcode/paycertificationapi/ta2;->XOO0ii0(Ljava/lang/String;I)[B

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->QRCODE:Lcom/szabh/smable3/BleKey;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v4

    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getQrcodeStreamType()I

    move-result v1

    invoke-virtual {v0, v3, p1, v1}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.QrcodeTypeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mQrcodeTypeInfo:Lcom/sma/smartv3/model/QrcodeTypeInfo;

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

    const v0, 0x7f0d00ea

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

    iget p2, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->REQUEST_CODE:I

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->showLoading()V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/ha2;

    invoke-direct {v5, p0, p3}, Lcom/android/mltcode/paycertificationapi/ha2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;Landroid/content/Intent;)V

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

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/QrcodeSyncActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ja2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ja2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ka2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ka2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->mSelectPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;->getRootView()Landroid/view/View;

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
