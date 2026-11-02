.class public final Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;
.super Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;
.source "SourceFile"


# instance fields
.field private final pointers$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iIXOiI;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O0iIXOiI;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->pointers$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$4(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$3(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$2(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXO()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->pointers_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final customizeDialBgItemClick$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c1

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$1(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c2

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$2(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c3

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$3(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c4

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$4(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c5

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$5(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c6

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$1(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDialBgItemClick$lambda$5(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method private static final pointers_delegate$lambda$0()Ljava/util/List;
    .locals 11

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808dd

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808de

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808df

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f0808e0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const v5, 0x7f0808e1

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const v6, 0x7f0808e2

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v5}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bitmap2Bytes(Landroid/graphics/Bitmap;)[B
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "finalBgBitMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getFileFormat()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v4, 0x10

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/X1iIIO;->OXO1(Ljava/lang/String;[BIIIZ)[B

    move-result-object p1

    return-object p1
.end method

.method public customizeDialBgItemClick(Lcom/android/mltcode/paycertificationapi/I0OOX;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/I0OOX;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->OiIIX101O()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i00I010;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i00I010;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->XiOIii1()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1i0XXXX;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/I1i0XXXX;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->OII()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0IOX0OO1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O0IOX0OO1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->OX()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOIiO10X;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OOIiO10X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->I1()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ii0iX01X1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ii0iX01X1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->iOOX010X()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiIIO0O1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IiIIO0O1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic customizeDir()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->customizeDir()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public customizeDir()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .line 2
    const-string v0, "dial_customize_172"

    return-object v0
.end method

.method public getFinalBgBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bgBitMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

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

.method public getPointers()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomize172_320Activity;->pointers$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIIi110I()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setSupportConvertPng(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->isSupportConvertPng()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setIgnoreBlack(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->isSupportConvertPng()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "png"

    goto :goto_1

    :cond_1
    const-string v0, "bmp"

    :goto_1
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setFileFormat(Ljava/lang/String;)V

    const/16 v0, 0xac

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenWidth(I)V

    const/16 v0, 0x140

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenHeight(I)V

    const/16 v0, 0x6e

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenPreviewWidth(I)V

    const/16 v0, 0xcc

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenPreviewHeight(I)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setControlValueInterval(I)V

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setControlValueRange(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setRound(Z)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setImageFormat(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setX_CENTER(I)V

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setY_CENTER(I)V

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setRoundCornerRadius(F)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0084

    return v0
.end method

.method public scalesList()Ljava/util/List;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808ee

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808ef

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
