.class public final Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final pacePF:Lcom/sma/smartv3/view/text/PFRegular;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rootViewSpeed:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rv:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final speedPf:Lcom/sma/smartv3/view/text/PFRegular;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgPace:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgPaceRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgPaceUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgSpeed:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgSpeedRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordAvgSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestPace:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestPaceRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestPaceUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestSpeed:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestSpeedRl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordFastestSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportRecordPaceChartRl:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFRegular;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/sma/smartv3/view/text/PFRegular;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/LinearLayout;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/text/PFRegular;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/text/PFRegular;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/view/text/PFMedium;
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
    .param p11    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Lcom/sma/smartv3/view/text/PFMedium;
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
    .param p17    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Landroid/widget/LinearLayout;
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
            "pacePF",
            "rootViewSpeed",
            "rv",
            "speedPf",
            "sportRecordAvgPace",
            "sportRecordAvgPaceRl",
            "sportRecordAvgPaceUnit",
            "sportRecordAvgSpeed",
            "sportRecordAvgSpeedRl",
            "sportRecordAvgSpeedUnit",
            "sportRecordFastestPace",
            "sportRecordFastestPaceRl",
            "sportRecordFastestPaceUnit",
            "sportRecordFastestSpeed",
            "sportRecordFastestSpeedRl",
            "sportRecordFastestSpeedUnit",
            "sportRecordPaceChartRl"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->pacePF:Lcom/sma/smartv3/view/text/PFRegular;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->rootViewSpeed:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->rv:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->speedPf:Lcom/sma/smartv3/view/text/PFRegular;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgPace:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgPaceRl:Landroid/widget/RelativeLayout;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgPaceUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgSpeed:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgSpeedRl:Landroid/widget/RelativeLayout;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordAvgSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestPace:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestPaceRl:Landroid/widget/RelativeLayout;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestPaceUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestSpeed:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestSpeedRl:Landroid/widget/RelativeLayout;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordFastestSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->sportRecordPaceChartRl:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;
    .locals 22
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

    const v1, 0x7f0a08e8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/text/PFRegular;

    if-eqz v5, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const v1, 0x7f0a09c1

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v7, :cond_0

    const v1, 0x7f0a0a73

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/sma/smartv3/view/text/PFRegular;

    if-eqz v8, :cond_0

    const v1, 0x7f0a0ab0

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v9, :cond_0

    const v1, 0x7f0a0ab1

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/RelativeLayout;

    if-eqz v10, :cond_0

    const v1, 0x7f0a0ab2

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v11, :cond_0

    const v1, 0x7f0a0ab3

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v12, :cond_0

    const v1, 0x7f0a0ab4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/RelativeLayout;

    if-eqz v13, :cond_0

    const v1, 0x7f0a0ab5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v14, :cond_0

    const v1, 0x7f0a0ac3

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0ac4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/RelativeLayout;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0ac5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v17, :cond_0

    const v1, 0x7f0a0ac6

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v18, :cond_0

    const v1, 0x7f0a0ac7

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/widget/RelativeLayout;

    if-eqz v19, :cond_0

    const v1, 0x7f0a0ac8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v20, :cond_0

    const v1, 0x7f0a0ad0

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroid/widget/LinearLayout;

    if-eqz v21, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;

    move-object v6, v4

    invoke-direct/range {v3 .. v21}, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFRegular;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/sma/smartv3/view/text/PFRegular;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/LinearLayout;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;
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

    const v0, 0x7f0d107e

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/StatusItemSportRecordSpeedBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
