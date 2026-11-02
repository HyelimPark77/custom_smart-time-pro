.class public final Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiXXO1i;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IiXXO1i;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->pointers$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$2(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$5(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$3(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$1(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXO()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->pointers_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final customizeDialBgItemClick$lambda$0(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c8

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$1(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808c9

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$2(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808ca

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$3(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808cb

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$4(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808cc

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final customizeDialBgItemClick$lambda$5(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getCustomizeDialBg()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    const p2, 0x7f0808cd

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$4(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDialBgItemClick$lambda$0(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;Landroid/view/View;)V

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXX1IOiOi;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IXX1IOiOi;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->XiOIii1()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i00Oi11IO;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i00Oi11IO;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->OII()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O111O;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O111O;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->OX()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1IOX0XX;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i1IOX0XX;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->I1()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiOIIOO1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/iiOIIOO1;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/I0OOX;->iOOX010X()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI1IiO;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OI1IiO;-><init>(Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;Lcom/android/mltcode/paycertificationapi/I0OOX;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic customizeDir()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->customizeDir()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public customizeDir()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .line 2
    const-string v0, "dial_customize_7"

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/old/DialCustomize11Activity;->pointers$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 1

    const/16 v0, 0xf0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenWidth(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenHeight(I)V

    const/16 v0, 0x96

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenPreviewWidth(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScreenPreviewHeight(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setControlValueInterval(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setIgnoreBlack(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setRound(Z)V

    const-string v0, "bmp"

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setFileFormat(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setImageFormat(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setX_CENTER(I)V

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setY_CENTER(I)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0085

    return v0
.end method

.method public scalesList()Ljava/util/List;
    .locals 9
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

    const v1, 0x7f0808f0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808f1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808f2

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f0808f3

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
