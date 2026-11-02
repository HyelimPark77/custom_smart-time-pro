.class public final Lcom/sma/smartv3/db/MyDb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/db/MyDb;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static mDatabase:Lcom/sma/smartv3/db/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/db/MyDb;

    invoke-direct {v0}, Lcom/sma/smartv3/db/MyDb;-><init>()V

    sput-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMDatabase()Lcom/sma/smartv3/db/AppDatabase;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->mDatabase:Lcom/sma/smartv3/db/AppDatabase;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mDatabase"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 57
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "db["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/db/AppDatabase;

    invoke-static {v0, v2, v1}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/db/MyDb$init$1;

    invoke-direct {v1}, Lcom/sma/smartv3/db/MyDb$init$1;-><init>()V

    new-instance v2, Lcom/sma/smartv3/db/MyDb$init$2;

    invoke-direct {v2}, Lcom/sma/smartv3/db/MyDb$init$2;-><init>()V

    new-instance v3, Lcom/sma/smartv3/db/MyDb$init$3;

    invoke-direct {v3}, Lcom/sma/smartv3/db/MyDb$init$3;-><init>()V

    new-instance v4, Lcom/sma/smartv3/db/MyDb$init$4;

    invoke-direct {v4}, Lcom/sma/smartv3/db/MyDb$init$4;-><init>()V

    new-instance v5, Lcom/sma/smartv3/db/MyDb$init$5;

    invoke-direct {v5}, Lcom/sma/smartv3/db/MyDb$init$5;-><init>()V

    new-instance v6, Lcom/sma/smartv3/db/MyDb$init$6;

    invoke-direct {v6}, Lcom/sma/smartv3/db/MyDb$init$6;-><init>()V

    new-instance v7, Lcom/sma/smartv3/db/MyDb$init$7;

    invoke-direct {v7}, Lcom/sma/smartv3/db/MyDb$init$7;-><init>()V

    new-instance v8, Lcom/sma/smartv3/db/MyDb$init$8;

    invoke-direct {v8}, Lcom/sma/smartv3/db/MyDb$init$8;-><init>()V

    new-instance v9, Lcom/sma/smartv3/db/MyDb$init$9;

    invoke-direct {v9}, Lcom/sma/smartv3/db/MyDb$init$9;-><init>()V

    new-instance v10, Lcom/sma/smartv3/db/MyDb$init$10;

    invoke-direct {v10}, Lcom/sma/smartv3/db/MyDb$init$10;-><init>()V

    new-instance v11, Lcom/sma/smartv3/db/MyDb$init$11;

    invoke-direct {v11}, Lcom/sma/smartv3/db/MyDb$init$11;-><init>()V

    new-instance v12, Lcom/sma/smartv3/db/MyDb$init$12;

    invoke-direct {v12}, Lcom/sma/smartv3/db/MyDb$init$12;-><init>()V

    new-instance v13, Lcom/sma/smartv3/db/MyDb$init$13;

    invoke-direct {v13}, Lcom/sma/smartv3/db/MyDb$init$13;-><init>()V

    new-instance v14, Lcom/sma/smartv3/db/MyDb$init$14;

    invoke-direct {v14}, Lcom/sma/smartv3/db/MyDb$init$14;-><init>()V

    new-instance v15, Lcom/sma/smartv3/db/MyDb$init$15;

    invoke-direct {v15}, Lcom/sma/smartv3/db/MyDb$init$15;-><init>()V

    new-instance v16, Lcom/sma/smartv3/db/MyDb$init$16;

    invoke-direct/range {v16 .. v16}, Lcom/sma/smartv3/db/MyDb$init$16;-><init>()V

    new-instance v17, Lcom/sma/smartv3/db/MyDb$init$17;

    invoke-direct/range {v17 .. v17}, Lcom/sma/smartv3/db/MyDb$init$17;-><init>()V

    new-instance v18, Lcom/sma/smartv3/db/MyDb$init$18;

    invoke-direct/range {v18 .. v18}, Lcom/sma/smartv3/db/MyDb$init$18;-><init>()V

    new-instance v19, Lcom/sma/smartv3/db/MyDb$init$19;

    invoke-direct/range {v19 .. v19}, Lcom/sma/smartv3/db/MyDb$init$19;-><init>()V

    new-instance v20, Lcom/sma/smartv3/db/MyDb$init$20;

    invoke-direct/range {v20 .. v20}, Lcom/sma/smartv3/db/MyDb$init$20;-><init>()V

    new-instance v21, Lcom/sma/smartv3/db/MyDb$init$21;

    invoke-direct/range {v21 .. v21}, Lcom/sma/smartv3/db/MyDb$init$21;-><init>()V

    new-instance v22, Lcom/sma/smartv3/db/MyDb$init$22;

    invoke-direct/range {v22 .. v22}, Lcom/sma/smartv3/db/MyDb$init$22;-><init>()V

    new-instance v23, Lcom/sma/smartv3/db/MyDb$init$23;

    invoke-direct/range {v23 .. v23}, Lcom/sma/smartv3/db/MyDb$init$23;-><init>()V

    new-instance v24, Lcom/sma/smartv3/db/MyDb$init$24;

    invoke-direct/range {v24 .. v24}, Lcom/sma/smartv3/db/MyDb$init$24;-><init>()V

    new-instance v25, Lcom/sma/smartv3/db/MyDb$init$25;

    invoke-direct/range {v25 .. v25}, Lcom/sma/smartv3/db/MyDb$init$25;-><init>()V

    new-instance v26, Lcom/sma/smartv3/db/MyDb$init$26;

    invoke-direct/range {v26 .. v26}, Lcom/sma/smartv3/db/MyDb$init$26;-><init>()V

    new-instance v27, Lcom/sma/smartv3/db/MyDb$init$27;

    invoke-direct/range {v27 .. v27}, Lcom/sma/smartv3/db/MyDb$init$27;-><init>()V

    new-instance v28, Lcom/sma/smartv3/db/MyDb$init$28;

    invoke-direct/range {v28 .. v28}, Lcom/sma/smartv3/db/MyDb$init$28;-><init>()V

    new-instance v29, Lcom/sma/smartv3/db/MyDb$init$29;

    invoke-direct/range {v29 .. v29}, Lcom/sma/smartv3/db/MyDb$init$29;-><init>()V

    new-instance v30, Lcom/sma/smartv3/db/MyDb$init$30;

    invoke-direct/range {v30 .. v30}, Lcom/sma/smartv3/db/MyDb$init$30;-><init>()V

    new-instance v31, Lcom/sma/smartv3/db/MyDb$init$31;

    invoke-direct/range {v31 .. v31}, Lcom/sma/smartv3/db/MyDb$init$31;-><init>()V

    new-instance v32, Lcom/sma/smartv3/db/MyDb$init$32;

    invoke-direct/range {v32 .. v32}, Lcom/sma/smartv3/db/MyDb$init$32;-><init>()V

    new-instance v33, Lcom/sma/smartv3/db/MyDb$init$33;

    invoke-direct/range {v33 .. v33}, Lcom/sma/smartv3/db/MyDb$init$33;-><init>()V

    new-instance v34, Lcom/sma/smartv3/db/MyDb$init$34;

    invoke-direct/range {v34 .. v34}, Lcom/sma/smartv3/db/MyDb$init$34;-><init>()V

    new-instance v35, Lcom/sma/smartv3/db/MyDb$init$35;

    invoke-direct/range {v35 .. v35}, Lcom/sma/smartv3/db/MyDb$init$35;-><init>()V

    new-instance v36, Lcom/sma/smartv3/db/MyDb$init$36;

    invoke-direct/range {v36 .. v36}, Lcom/sma/smartv3/db/MyDb$init$36;-><init>()V

    new-instance v37, Lcom/sma/smartv3/db/MyDb$init$37;

    invoke-direct/range {v37 .. v37}, Lcom/sma/smartv3/db/MyDb$init$37;-><init>()V

    new-instance v38, Lcom/sma/smartv3/db/MyDb$init$38;

    invoke-direct/range {v38 .. v38}, Lcom/sma/smartv3/db/MyDb$init$38;-><init>()V

    new-instance v39, Lcom/sma/smartv3/db/MyDb$init$39;

    invoke-direct/range {v39 .. v39}, Lcom/sma/smartv3/db/MyDb$init$39;-><init>()V

    new-instance v40, Lcom/sma/smartv3/db/MyDb$init$40;

    invoke-direct/range {v40 .. v40}, Lcom/sma/smartv3/db/MyDb$init$40;-><init>()V

    new-instance v41, Lcom/sma/smartv3/db/MyDb$init$41;

    invoke-direct/range {v41 .. v41}, Lcom/sma/smartv3/db/MyDb$init$41;-><init>()V

    new-instance v42, Lcom/sma/smartv3/db/MyDb$init$42;

    invoke-direct/range {v42 .. v42}, Lcom/sma/smartv3/db/MyDb$init$42;-><init>()V

    new-instance v43, Lcom/sma/smartv3/db/MyDb$init$43;

    invoke-direct/range {v43 .. v43}, Lcom/sma/smartv3/db/MyDb$init$43;-><init>()V

    new-instance v44, Lcom/sma/smartv3/db/MyDb$init$44;

    invoke-direct/range {v44 .. v44}, Lcom/sma/smartv3/db/MyDb$init$44;-><init>()V

    new-instance v45, Lcom/sma/smartv3/db/MyDb$init$45;

    invoke-direct/range {v45 .. v45}, Lcom/sma/smartv3/db/MyDb$init$45;-><init>()V

    new-instance v46, Lcom/sma/smartv3/db/MyDb$init$46;

    invoke-direct/range {v46 .. v46}, Lcom/sma/smartv3/db/MyDb$init$46;-><init>()V

    new-instance v47, Lcom/sma/smartv3/db/MyDb$init$47;

    invoke-direct/range {v47 .. v47}, Lcom/sma/smartv3/db/MyDb$init$47;-><init>()V

    new-instance v48, Lcom/sma/smartv3/db/MyDb$init$48;

    invoke-direct/range {v48 .. v48}, Lcom/sma/smartv3/db/MyDb$init$48;-><init>()V

    new-instance v49, Lcom/sma/smartv3/db/MyDb$init$49;

    invoke-direct/range {v49 .. v49}, Lcom/sma/smartv3/db/MyDb$init$49;-><init>()V

    new-instance v50, Lcom/sma/smartv3/db/MyDb$init$50;

    invoke-direct/range {v50 .. v50}, Lcom/sma/smartv3/db/MyDb$init$50;-><init>()V

    new-instance v51, Lcom/sma/smartv3/db/MyDb$init$51;

    invoke-direct/range {v51 .. v51}, Lcom/sma/smartv3/db/MyDb$init$51;-><init>()V

    new-instance v52, Lcom/sma/smartv3/db/MyDb$init$52;

    invoke-direct/range {v52 .. v52}, Lcom/sma/smartv3/db/MyDb$init$52;-><init>()V

    new-instance v53, Lcom/sma/smartv3/db/MyDb$init$53;

    invoke-direct/range {v53 .. v53}, Lcom/sma/smartv3/db/MyDb$init$53;-><init>()V

    new-instance v54, Lcom/sma/smartv3/db/MyDb$init$54;

    invoke-direct/range {v54 .. v54}, Lcom/sma/smartv3/db/MyDb$init$54;-><init>()V

    new-instance v55, Lcom/sma/smartv3/db/MyDb$init$55;

    invoke-direct/range {v55 .. v55}, Lcom/sma/smartv3/db/MyDb$init$55;-><init>()V

    move-object/from16 p1, v1

    const/16 v1, 0x37

    new-array v1, v1, [Landroidx/room/migration/Migration;

    const/16 v56, 0x0

    aput-object p1, v1, v56

    const/16 v56, 0x1

    aput-object v2, v1, v56

    const/4 v2, 0x2

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aput-object v4, v1, v2

    const/4 v2, 0x4

    aput-object v5, v1, v2

    const/4 v2, 0x5

    aput-object v6, v1, v2

    const/4 v2, 0x6

    aput-object v7, v1, v2

    const/4 v2, 0x7

    aput-object v8, v1, v2

    const/16 v2, 0x8

    aput-object v9, v1, v2

    const/16 v2, 0x9

    aput-object v10, v1, v2

    const/16 v2, 0xa

    aput-object v11, v1, v2

    const/16 v2, 0xb

    aput-object v12, v1, v2

    const/16 v2, 0xc

    aput-object v13, v1, v2

    const/16 v2, 0xd

    aput-object v14, v1, v2

    const/16 v2, 0xe

    aput-object v15, v1, v2

    const/16 v2, 0xf

    aput-object v16, v1, v2

    const/16 v2, 0x10

    aput-object v17, v1, v2

    const/16 v2, 0x11

    aput-object v18, v1, v2

    const/16 v2, 0x12

    aput-object v19, v1, v2

    const/16 v2, 0x13

    aput-object v20, v1, v2

    const/16 v2, 0x14

    aput-object v21, v1, v2

    const/16 v2, 0x15

    aput-object v22, v1, v2

    const/16 v2, 0x16

    aput-object v23, v1, v2

    const/16 v2, 0x17

    aput-object v24, v1, v2

    const/16 v2, 0x18

    aput-object v25, v1, v2

    const/16 v2, 0x19

    aput-object v26, v1, v2

    const/16 v2, 0x1a

    aput-object v27, v1, v2

    const/16 v2, 0x1b

    aput-object v28, v1, v2

    const/16 v2, 0x1c

    aput-object v29, v1, v2

    const/16 v2, 0x1d

    aput-object v30, v1, v2

    const/16 v2, 0x1e

    aput-object v31, v1, v2

    const/16 v2, 0x1f

    aput-object v32, v1, v2

    const/16 v2, 0x20

    aput-object v33, v1, v2

    const/16 v2, 0x21

    aput-object v34, v1, v2

    const/16 v2, 0x22

    aput-object v35, v1, v2

    const/16 v2, 0x23

    aput-object v36, v1, v2

    const/16 v2, 0x24

    aput-object v37, v1, v2

    const/16 v2, 0x25

    aput-object v38, v1, v2

    const/16 v2, 0x26

    aput-object v39, v1, v2

    const/16 v2, 0x27

    aput-object v40, v1, v2

    const/16 v2, 0x28

    aput-object v41, v1, v2

    const/16 v2, 0x29

    aput-object v42, v1, v2

    const/16 v2, 0x2a

    aput-object v43, v1, v2

    const/16 v2, 0x2b

    aput-object v44, v1, v2

    const/16 v2, 0x2c

    aput-object v45, v1, v2

    const/16 v2, 0x2d

    aput-object v46, v1, v2

    const/16 v2, 0x2e

    aput-object v47, v1, v2

    const/16 v2, 0x2f

    aput-object v48, v1, v2

    const/16 v2, 0x30

    aput-object v49, v1, v2

    const/16 v2, 0x31

    aput-object v50, v1, v2

    const/16 v2, 0x32

    aput-object v51, v1, v2

    const/16 v2, 0x33

    aput-object v52, v1, v2

    const/16 v2, 0x34

    aput-object v53, v1, v2

    const/16 v2, 0x35

    aput-object v54, v1, v2

    const/16 v2, 0x36

    aput-object v55, v1, v2

    invoke-virtual {v0, v1}, Landroidx/room/RoomDatabase$Builder;->addMigrations([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/RoomDatabase$Builder;->allowMainThreadQueries()Landroidx/room/RoomDatabase$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/AppDatabase;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/db/MyDb;->setMDatabase(Lcom/sma/smartv3/db/AppDatabase;)V

    return-void
.end method

.method public final setMDatabase(Lcom/sma/smartv3/db/AppDatabase;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/AppDatabase;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/db/MyDb;->mDatabase:Lcom/sma/smartv3/db/AppDatabase;

    return-void
.end method
