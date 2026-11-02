.class public final Lcom/sma/smartv3/ui/device/CustomLogoActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomLogoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomLogoActivity.kt\ncom/sma/smartv3/ui/device/CustomLogoActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,398:1\n37#2,2:399\n*S KotlinDebug\n*F\n+ 1 CustomLogoActivity.kt\ncom/sma/smartv3/ui/device/CustomLogoActivity\n*L\n368#1:399,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomLogoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomLogoActivity.kt\ncom/sma/smartv3/ui/device/CustomLogoActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,398:1\n37#2,2:399\n*S KotlinDebug\n*F\n+ 1 CustomLogoActivity.kt\ncom/sma/smartv3/ui/device/CustomLogoActivity\n*L\n368#1:399,2\n*E\n"
    }
.end annotation


# instance fields
.field private borderSize:I

.field private final btnSync$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final customBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private facePanelLayoutId:I

.field private isRound:Z

.field private final ivAdd$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/CustomLogoActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCrop$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private roundCornerRadius:F

.field private screenHeight:I

.field private screenWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II000;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/II000;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->customBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOiXIXi1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOiXIXi1I;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->ivAdd$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1XiX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1XiX1;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->btnSync$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiOOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiOOI;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mCrop$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/CustomLogoActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/CustomLogoActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->selectImagePopup$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->customBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->selectImagePopup$lambda$0$0$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->ivAdd_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->selectImagePopup$lambda$0$1(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->btnSync_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtnSync(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getBtnSync()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCustomBg(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getCustomBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getIvAdd(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getIvAdd()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMProgressPop$p(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/android/mltcode/paycertificationapi/c72;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object p0
.end method

.method public static final synthetic access$getMSelectAvatarPopup$p(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/android/mltcode/paycertificationapi/xz3;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    return-object p0
.end method

.method public static final synthetic access$getRoundCornerRadius$p(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->roundCornerRadius:F

    return p0
.end method

.method public static final synthetic access$isRound$p(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return p0
.end method

.method public static final synthetic access$setMProgressPop$p(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public static final synthetic access$syncFailed(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->syncFailed()V

    return-void
.end method

.method private static final btnSync_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final customBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    const v0, 0x7f0a02c3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object p0
.end method

.method private final getBgBitmap()Landroid/graphics/Bitmap;
    .locals 7

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getCustomBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/ImageUtils;->view2Bitmap(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getCustomBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v0, "getDrawable(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "test getBgBitmap = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "- "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " ; "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->scale(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    const v2, 0x7f06019d

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->borderSize:I

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->toRound(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->roundCornerRadius:F

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lcom/blankj/utilcode/util/ImageUtils;->toRoundCorner(Landroid/graphics/Bitmap;FFI)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getFinalBgBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private final getBtnSync()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->btnSync$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getCustomBg()Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->customBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object v0
.end method

.method private final getFinalBgBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-object v0
.end method

.method private final getIvAdd()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->ivAdd$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mCrop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    return-object v0
.end method

.method private final initConfig()V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x7f0d0f3f

    const/16 v3, 0x168

    const/16 v4, 0x140

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v7, 0xf0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "F12Pro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "AM02J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "AM01J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "HW01"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "F13B"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "AW37"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0d0f40

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_6
    const-string v1, "AM11"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const v0, 0x7f0d0f45

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const/16 v0, 0x150

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x1e0

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_7
    const-string v1, "AM08"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const v0, 0x7f0d0f49

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const/16 v0, 0x19a

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x1f6

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_8
    const-string v1, "AM05"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "AM01"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "V61"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "R16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const v0, 0x7f0d0f4a

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const/16 v0, 0x19c

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_c
    const-string v1, "K18"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const v0, 0x7f0d0f43

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v4, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v4, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_d
    const-string v1, "FT5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "FC2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const v0, 0x7f0d0f46

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v3, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v3, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_f
    const-string v1, "FC1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iput v2, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_10
    const-string v1, "F17"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const v0, 0x7f0d0f47

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v3, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x190

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_11
    const-string v1, "F12"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const v0, 0x7f0d0f48

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const/16 v0, 0x170

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x1c0

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_12
    const-string v1, "A8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :sswitch_13
    const-string v1, "A7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const v0, 0x7f0d0f41

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x11e

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_14
    const-string v1, "A8_Ultra_Pro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const v0, 0x7f0d0f44

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v4, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x182

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_15
    const-string v1, "SF15GUC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const v0, 0x7f0d0f4b

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const/16 v0, 0x1d2

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :sswitch_16
    const-string v1, "JX621D"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_0
    iput v2, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    :cond_c
    const v0, 0x7f0d0f42

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    iput v7, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    const/16 v0, 0x128

    iput v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    iput-boolean v6, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->isRound:Z

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cc7ffc3 -> :sswitch_16
        -0x5f1be202 -> :sswitch_15
        -0x48682ce -> :sswitch_14
        0x816 -> :sswitch_13
        0x817 -> :sswitch_12
        0x10ce7 -> :sswitch_11
        0x10cec -> :sswitch_10
        0x10f14 -> :sswitch_f
        0x10f15 -> :sswitch_e
        0x11127 -> :sswitch_d
        0x11fb2 -> :sswitch_c
        0x139f7 -> :sswitch_b
        0x14991 -> :sswitch_a
        0x1eb32d -> :sswitch_9
        0x1eb331 -> :sswitch_8
        0x1eb334 -> :sswitch_7
        0x1eb34c -> :sswitch_6
        0x1ed91a -> :sswitch_5
        0x20905a -> :sswitch_4
        0x220750 -> :sswitch_3
        0x3b7b2bd -> :sswitch_2
        0x3b7b2dc -> :sswitch_1
        0x7a3db046 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->selectImagePopup()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    const/16 v2, 0x140

    if-ge v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    mul-int/lit8 v1, v1, 0x2

    :cond_0
    move v8, v0

    move v9, v1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pickMedia result: outputX:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " outputY:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v2

    int-to-double v0, v8

    int-to-double v3, v9

    div-double v6, v0, v3

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    move-object v3, p1

    invoke-virtual/range {v2 .. v9}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->O00(Landroid/net/Uri;DDII)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final ivAdd_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a060c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/CustomLogoActivity$XIi00iiXO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;-><init>(Ljava/lang/Object;Lcom/android/mltcode/paycertificationapi/i1Ii1i11X$XIi00iiXO;)V

    return-object v0
.end method

.method private final selectImagePopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXX0011;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/OXX0011;-><init>(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0OX0O0OX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I0OX0O0OX;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final selectImagePopup$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i111II1O1;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/i111II1O1;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->iOOX010X(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectImagePopup$lambda$0$0$0(Lcom/sma/smartv3/ui/device/CustomLogoActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->iO()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectImagePopup$lambda$0$1(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->OIX0iXi()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sync()V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-nez v1, :cond_2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c72;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v0, v3, v4, v2}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f1412fd

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getBgBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->iIXi1iiXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v5, v6}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/szabh/smable3/entity/BrandInfoImageItem;

    const/16 v12, 0x1f

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/szabh/smable3/entity/BrandInfoImageItem;-><init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v3}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->setMX(I)V

    invoke-virtual {v6, v3}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->setMY(I)V

    const/16 v7, 0x9

    invoke-virtual {v6, v7}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->setMAnchor(I)V

    const/16 v7, 0xbb8

    invoke-virtual {v6, v7}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->setMPlayInterval(I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    sget-object v8, Lcom/android/mltcode/paycertificationapi/X1XX1O;->XXiO0i:Lcom/android/mltcode/paycertificationapi/X1XX1O$OXO1;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->iIXi1iiXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v9

    const/4 v12, 0x4

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/X1XX1O$OXO1;->XO0O10(Lcom/android/mltcode/paycertificationapi/X1XX1O$OXO1;Ljava/io/File;ZZILjava/lang/Object;)[B

    move-result-object v20

    if-eqz v20, :cond_1

    new-instance v14, Lcom/szabh/smable3/entity/BrandInfoImage;

    iget v15, v0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iget v2, v0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMSupport2DAcceleration()I

    move-result v1

    const/4 v8, 0x1

    if-ne v1, v8, :cond_0

    move/from16 v17, v4

    goto :goto_0

    :cond_0
    move/from16 v17, v8

    :goto_0
    const/16 v18, 0x1

    const/16 v19, 0x0

    move/from16 v16, v2

    invoke-direct/range {v14 .. v20}, Lcom/szabh/smable3/entity/BrandInfoImage;-><init>(IIIII[B)V

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-array v1, v3, [Lcom/szabh/smable3/entity/BrandInfoImage;

    invoke-interface {v7, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/szabh/smable3/entity/BrandInfoImage;

    invoke-virtual {v6, v1}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->setMImageInfos([Lcom/szabh/smable3/entity/BrandInfoImage;)V

    sget-object v1, Lcom/szabh/smable3/entity/BrandInfoBuilder;->INSTANCE:Lcom/szabh/smable3/entity/BrandInfoBuilder;

    invoke-virtual {v1, v5, v6}, Lcom/szabh/smable3/entity/BrandInfoBuilder;->build(Ljava/lang/String;Lcom/szabh/smable3/entity/BrandInfoImageItem;)[B

    move-result-object v9

    array-length v1, v9

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BrandInfo -> size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v7, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v8, Lcom/szabh/smable3/BleKey;->LOGO_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;[BIILjava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method private final syncFailed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    const v0, 0x7f1412f9

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/CustomLogoActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140391

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getBtnSync()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->initConfig()V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->facePanelLayoutId:I

    const v2, 0x7f0a03c0

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getCustomBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1i1IO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1i1IO;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO0I1OiO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IO0I1OiO;-><init>(Lcom/sma/smartv3/ui/device/CustomLogoActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->XXI(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0056

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 12
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenWidth:I

    iget v1, p0, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->screenHeight:I

    const/16 v2, 0x140

    if-ge v0, v2, :cond_1

    mul-int/lit8 v0, v0, 0x2

    mul-int/lit8 v1, v1, 0x2

    :cond_1
    move v10, v0

    move v11, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult outputX:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " outputY:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v2

    int-to-double v0, v10

    int-to-double v3, v11

    div-double v8, v0, v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-virtual/range {v2 .. v11}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->XOO0ii0(IILandroid/content/Intent;DDII)V

    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CustomLogoActivity;->sync()V

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
