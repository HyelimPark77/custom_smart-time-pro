.class public final Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rootViewHeartRate:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAerobic:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAerobicRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAnaerobic:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAnaerobicRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgHR:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgHRRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFatBurning:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFatBurningRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordLineChartHR:Lcom/github/mikephil/charting/charts/LineChart;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordLineChartHRRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordMaxHR:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordMaxHRRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordStrenuous:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordStrenuousRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordWarmUp:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordWarmUpRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Lcom/github/mikephil/charting/charts/LineChart;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView",
            "rootViewHeartRate",
            "sportRecordAerobic",
            "sportRecordAerobicRl",
            "sportRecordAnaerobic",
            "sportRecordAnaerobicRl",
            "sportRecordAvgHR",
            "sportRecordAvgHRRl",
            "sportRecordFatBurning",
            "sportRecordFatBurningRl",
            "sportRecordLineChartHR",
            "sportRecordLineChartHRRl",
            "sportRecordMaxHR",
            "sportRecordMaxHRRl",
            "sportRecordStrenuous",
            "sportRecordStrenuousRl",
            "sportRecordWarmUp",
            "sportRecordWarmUpRl"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->rootViewHeartRate:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAerobic:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAerobicRl:Landroid/widget/RelativeLayout;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAnaerobic:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAnaerobicRl:Landroid/widget/RelativeLayout;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAvgHR:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordAvgHRRl:Landroid/widget/RelativeLayout;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordFatBurning:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordFatBurningRl:Landroid/widget/RelativeLayout;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordLineChartHR:Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordLineChartHRRl:Landroid/widget/RelativeLayout;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordMaxHR:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordMaxHRRl:Landroid/widget/RelativeLayout;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordStrenuous:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordStrenuousRl:Landroid/widget/RelativeLayout;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordWarmUp:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->sportRecordWarmUpRl:Landroid/widget/RelativeLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;
    .locals 19
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rootView"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0a0aa7

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v3, :cond_0

    const v2, 0x7f0a0aa8

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    if-eqz v4, :cond_0

    const v2, 0x7f0a0aac

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v5, :cond_0

    const v2, 0x7f0a0aad

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    if-eqz v6, :cond_0

    const v2, 0x7f0a0aae

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v7, :cond_0

    const v2, 0x7f0a0aaf

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/RelativeLayout;

    if-eqz v8, :cond_0

    const v2, 0x7f0a0ac9

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v9, :cond_0

    const v2, 0x7f0a0aca

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/RelativeLayout;

    if-eqz v10, :cond_0

    const v2, 0x7f0a0acb

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v11, :cond_0

    const v2, 0x7f0a0acc

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/RelativeLayout;

    if-eqz v12, :cond_0

    const v2, 0x7f0a0ace

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v13, :cond_0

    const v2, 0x7f0a0acf

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/RelativeLayout;

    if-eqz v14, :cond_0

    const v2, 0x7f0a0ad5

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v15, :cond_0

    const v2, 0x7f0a0ad6

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/RelativeLayout;

    if-eqz v16, :cond_0

    const v2, 0x7f0a0ad7

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v17, :cond_0

    const v2, 0x7f0a0ad8

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    check-cast v18, Landroid/widget/RelativeLayout;

    if-eqz v18, :cond_0

    new-instance v0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v18}, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "parent",
            "attachToParent"
        }
    .end annotation

    const v0, 0x7f0d107d

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordHeartRateBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
