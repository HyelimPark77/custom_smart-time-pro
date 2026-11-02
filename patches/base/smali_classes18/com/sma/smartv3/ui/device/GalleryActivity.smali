.class public final Lcom/sma/smartv3/ui/device/GalleryActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final mHeight:I

.field private final mUris:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private final mWidth:I

.field private final viewPager$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiIXiX11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOiIXiX11;-><init>(Lcom/sma/smartv3/ui/device/GalleryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->viewPager$delegate:Lkotlin/Lazy;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/iO0O1OIIi;->OXO1()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mUris:Ljava/util/List;

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenWidth()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mWidth:I

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenHeight()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mHeight:I

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/GalleryActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GalleryActivity;->viewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GalleryActivity;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/device/GalleryActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMHeight$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mHeight:I

    return p0
.end method

.method public static final synthetic access$getMUris$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mUris:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMWidth$p(Lcom/sma/smartv3/ui/device/GalleryActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->mWidth:I

    return p0
.end method

.method private final getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GalleryActivity;->viewPager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    return-object v0
.end method

.method private static final viewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GalleryActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 1

    const v0, 0x7f0a18fd    # 1.835632E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GalleryActivity;->getViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/GalleryActivity$initView$1;-><init>(Lcom/sma/smartv3/ui/device/GalleryActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GalleryActivity;->getViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00a3

    return v0
.end method
