.class public final Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final llWeightMeasureItemPanel:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final recyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tabAll:Lcom/google/android/material/tabs/TabItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tabHigh:Lcom/google/android/material/tabs/TabItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tabLow:Lcom/google/android/material/tabs/TabItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tabStandard:Lcom/google/android/material/tabs/TabItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final table:Lcom/google/android/material/tabs/TabLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvBfrValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeightUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeightValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/android/material/tabs/TabItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/google/android/material/tabs/TabItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/google/android/material/tabs/TabItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/google/android/material/tabs/TabItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/google/android/material/tabs/TabLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/text/DINCondBold;
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
            0x0
        }
        names = {
            "rootView",
            "llWeightMeasureItemPanel",
            "recyclerView",
            "sbvBmi",
            "tabAll",
            "tabHigh",
            "tabLow",
            "tabStandard",
            "table",
            "tvBfrValue",
            "tvWeightUnit",
            "tvWeightValue"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->llWeightMeasureItemPanel:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->sbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tabAll:Lcom/google/android/material/tabs/TabItem;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tabHigh:Lcom/google/android/material/tabs/TabItem;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tabLow:Lcom/google/android/material/tabs/TabItem;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tabStandard:Lcom/google/android/material/tabs/TabItem;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->table:Lcom/google/android/material/tabs/TabLayout;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tvBfrValue:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tvWeightUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->tvWeightValue:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;
    .locals 15
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

    const v0, 0x7f0a0734

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0995

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v5, :cond_0

    const v0, 0x7f0a09e0

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    if-eqz v6, :cond_0

    const v0, 0x7f0a0b5f

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/material/tabs/TabItem;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0b60

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/google/android/material/tabs/TabItem;

    if-eqz v8, :cond_0

    const v0, 0x7f0a0b61

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/material/tabs/TabItem;

    if-eqz v9, :cond_0

    const v0, 0x7f0a0b62

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/google/android/material/tabs/TabItem;

    if-eqz v10, :cond_0

    const v0, 0x7f0a0b64

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/google/android/material/tabs/TabLayout;

    if-eqz v11, :cond_0

    const v0, 0x7f0a0c40

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v12, :cond_0

    const v0, 0x7f0a18c8

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v13, :cond_0

    const v0, 0x7f0a18c9

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v14, :cond_0

    new-instance v2, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v14}, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabItem;Lcom/google/android/material/tabs/TabLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;
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

    const v0, 0x7f0d0f6b

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/LayoutWeightMeasureReportBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
