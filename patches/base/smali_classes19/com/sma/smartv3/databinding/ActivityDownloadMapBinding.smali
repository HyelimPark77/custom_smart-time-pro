.class public final Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final abhMaskView:Lcom/sma/smartv3/view/MaskView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final abhRootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final abhSearchMapEt:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final bMapView:Lcom/baidu/mapapi/map/TextureMapView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final downloadMapsTipTitle:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final gMapView:Lcom/sma/smartv3/view/CustomGoogleMapView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final searchFuncLl:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final searchView:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/MaskView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/baidu/mapapi/map/TextureMapView;Landroid/widget/TextView;Lcom/sma/smartv3/view/CustomGoogleMapView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/MaskView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/baidu/mapapi/map/TextureMapView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/CustomGoogleMapView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/TextView;
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
            0x0
        }
        names = {
            "rootView",
            "abhMaskView",
            "abhRootView",
            "abhSearchMapEt",
            "bMapView",
            "downloadMapsTipTitle",
            "gMapView",
            "searchFuncLl",
            "searchView"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->abhMaskView:Lcom/sma/smartv3/view/MaskView;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->abhRootView:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->abhSearchMapEt:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->bMapView:Lcom/baidu/mapapi/map/TextureMapView;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->downloadMapsTipTitle:Landroid/widget/TextView;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->gMapView:Lcom/sma/smartv3/view/CustomGoogleMapView;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->searchFuncLl:Landroid/widget/LinearLayout;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->searchView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;
    .locals 12
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

    const v0, 0x7f0a001a

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/sma/smartv3/view/MaskView;

    if-eqz v4, :cond_0

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    const v0, 0x7f0a001e

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/LinearLayout;

    if-eqz v6, :cond_0

    const v0, 0x7f0a00fc

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/baidu/mapapi/map/TextureMapView;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0324

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    const v0, 0x7f0a03fb

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/sma/smartv3/view/CustomGoogleMapView;

    if-eqz v9, :cond_0

    const v0, 0x7f0a09f4

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    const v0, 0x7f0a0a01

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    new-instance v2, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;

    move-object v5, v3

    invoke-direct/range {v2 .. v11}, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/MaskView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/baidu/mapapi/map/TextureMapView;Landroid/widget/TextView;Lcom/sma/smartv3/view/CustomGoogleMapView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;
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

    const v0, 0x7f0d008e

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityDownloadMapBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
